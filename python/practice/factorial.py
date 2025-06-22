def calculate_factorial(n):
    result = 1
    while n > 0:
        result *= n
        n -= 1
    return result

# Example: Calculate factorial of 5
number = 5
factorial_result = calculate_factorial(number)
print(f"The factorial of {number} is {factorial_result}")


    


