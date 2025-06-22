def remove_duplicates(input_list):
    unique_list = []
    for item in input_list:
        if item not in unique_list:
            unique_list.append(item)
    return unique_list
input_list = [1, 2, 2, 3, 4, 4, 5]
result = remove_duplicates(input_list)
print("Original List:", input_list)
print("List with Duplicates Removed:", result)
