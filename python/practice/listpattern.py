def list_pattern():
    numbers = []
    for i in range(0, 6):
        num = int(input(f"Enter number {i + 1}: "))
        numbers.append(num)

    n = len(numbers)
    current_index = 0

    for i in range(n):
        # Print leading spaces
        for j in range(n - i - 1):
            print(" ", end=" ")

        # Print numbers
        for j in range(i + 1):
            print(numbers[current_index], end=" ")
            current_index += 1

        # Move to the next line after each row
        print()

# Call the function to take input and print the pyramid
list_pattern()
