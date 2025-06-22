def list_sum():
    num_elements = int(input("Enter the number of elements in the list: "))
    numbers = []
    for i in range(num_elements):
        num = float(input(f"Enter number {i + 1}: "))
        numbers.append(num)
    total_sum = sum(numbers)
    print(f"The sum of the numbers is: {total_sum}")
list_sum()

