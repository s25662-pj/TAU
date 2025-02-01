import asyncio
import pytest
import pytest_asyncio
from unittest.mock import AsyncMock
from bank_system import Account, Bank, InsufficientFundsError


@pytest.fixture
def account():
    return Account("123456", "John Doe", 100.0)


@pytest.fixture
def another_account():
    return Account("654321", "Jane Doe", 50.0)


@pytest.fixture
def bank():
    return Bank()


def test_deposit(account):
    account.deposit(50.0)
    assert account.balance == 150.0


def test_withdraw(account):
    account.withdraw(50.0)
    assert account.balance == 50.0

    with pytest.raises(InsufficientFundsError):
        account.withdraw(200.0)


@pytest_asyncio.fixture
def async_bank():
    return Bank()


@pytest.mark.asyncio
async def test_transfer(account, another_account):
    await account.transfer(another_account, 50.0)
    assert account.balance == 50.0
    assert another_account.balance == 100.0

    with pytest.raises(InsufficientFundsError):
        await account.transfer(another_account, 200.0)


def test_create_account(bank):
    bank.create_account("789101", "Alice", 200.0)
    assert bank.get_account("789101").balance == 200.0


def test_get_account(bank):
    bank.create_account("111222", "Bob", 100.0)
    account = bank.get_account("111222")
    assert account.owner == "Bob"
    assert account.balance == 100.0

    with pytest.raises(ValueError):
        bank.get_account("000000")


@pytest.mark.asyncio
async def test_process_transaction(async_bank, account, another_account):
    async def mock_transaction():
        await account.transfer(another_account, 30.0)

    await async_bank.process_transaction(mock_transaction)
    assert account.balance == 70.0
    assert another_account.balance == 80.0


def test_mock_external_authorization():
    mock_auth = AsyncMock(return_value=True)
    assert asyncio.run(mock_auth())
