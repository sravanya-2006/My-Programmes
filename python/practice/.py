def create_pyramid_pattern():
    n = int(input("Enter the number of items in the list: "))

    # Take input for each item in the list
    items = []
    for i in range(n):
        item = input(f"Enter item {i + 1}: ")
        items.append(item)

    # Print the pyramid pattern
    for i in range(n):
        # Print leading spaces
        for j in range(n - i - 1):
            print(" ", end=" ")

        # Print items
        for j in range(i + 1):
            print(items[j], end=" ")

        # Print items in reverse order
        for j in range(i - 1, -1, -1):
            print(items[j], end=" ")

        # Move to the next line after each row
        print()

# Call the function to create and print the pyramid pattern
create_pyramid_pattern()
