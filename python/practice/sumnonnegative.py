def sum_of_digits(n):
    if n < 0:
        print("Please enter a non-negative integer.")
        return
    digit_list = [int(digit) for digit in str(n)]
    digit_sum = sum(digit_list)
    print(f"The sum of the digits of {n} is: {digit_sum}")
user_input = input("Enter a non-negative integer: ")
if user_input.isdigit():
    user_number = int(user_input)
    sum_of_digits(user_number)
else:
    print("Invalid input. Please enter a non-negative integer.")
    