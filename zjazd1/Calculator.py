def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    if b == 0:
        raise ValueError("Cannot divide by zero.")
    return a / b

def is_even(number):
    return number % 2 == 0

def factorial(number):
    if number < 0:
        raise ValueError("Factorial is not defined for negative numbers.")
    if number == 0:
        return 1
    result = 1
    for i in range(2, number + 1):
        result *= i
    return result

def fibonacci(index):
    if index < 0:
        raise ValueError("Fibonacci is not defined for negative numbers.")
    current, next = 0, 1
    for _ in range(index):
        current, next = next, current + next
    return current

def power(base, exponent):
    return base ** exponent

def is_prime(number):
    if number <= 1:
        return False
    for divisor in range(2, int(number**0.5) + 1):
        if number % divisor == 0:
            return False
    return True

#NWD
def gcd(num1, num2):
    while num2:
        num1, num2 = num2, num1 % num2
    return abs(num1)

