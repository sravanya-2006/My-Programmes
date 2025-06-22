def sort_alphabetically():
    num_strings = int(input("Enter the number of strings in the list: "))
    strings = []
    for i in range(num_strings):
        string = input(f"Enter string {i + 1}: ")
        strings.append(string)
    sorted_strings = sorted(strings)

    print("Sorted list in alphabetical order:")
    for s in sorted_strings:
        print(s)
sort_alphabetically()
