number = int(input("enter a number: "))
sum_digit = 0
while number > 0:
    digit = number% 10
    sum_digit += digit
    number // 10
print(f"sum of digits of number {sum_digit}")


