import unittest

from Calculator import (
    add, subtract, multiply, divide, is_even,
    factorial, fibonacci, power, is_prime, gcd
)

class TestMathOperations(unittest.TestCase):

    def test_add(self):
        self.assertEqual(add(10, 20), 30)
        self.assertEqual(add(-5, -5), -10)
        self.assertIsInstance(add(0, 1), int)

    def test_subtract(self):
        self.assertEqual(subtract(15, 5), 10)
        self.assertEqual(subtract(7, 10), -3)
        self.assertIsInstance(subtract(100, 50), int)

    def test_multiply(self):
        self.assertEqual(multiply(6, 7), 42)
        self.assertEqual(multiply(10, 0), 0)
        self.assertIsInstance(multiply(3.2, 2), float)

    def test_divide(self):
        self.assertEqual(divide(20, 5), 4)
        self.assertEqual(divide(7, 3), 7 / 3)
        with self.assertRaises(ValueError):
            divide(1, 0)

    def test_is_even(self):
        self.assertTrue(is_even(10))
        self.assertFalse(is_even(11))
        self.assertIsInstance(is_even(22), bool)

    def test_factorial(self):
        self.assertEqual(factorial(4), 24)
        self.assertEqual(factorial(1), 1)
        with self.assertRaises(ValueError):
            factorial(-10)

    def test_fibonacci(self):
        self.assertEqual(fibonacci(10), 55)
        self.assertEqual(fibonacci(2), 1)
        with self.assertRaises(ValueError):
            fibonacci(-5)

    def test_power(self):
        self.assertEqual(power(3, 3), 27)
        self.assertEqual(power(10, 0), 1)
        self.assertIsInstance(power(5, 2), int)

    def test_is_prime(self):
        self.assertTrue(is_prime(13))
        self.assertFalse(is_prime(9))
        self.assertFalse(is_prime(0))
        self.assertIsInstance(is_prime(23), bool)

    def test_gcd(self):
        self.assertEqual(gcd(56, 98), 14)
        self.assertEqual(gcd(101, 103), 1)
        self.assertIsInstance(gcd(120, 45), int)

if __name__ == '__main__':
    unittest.main()
