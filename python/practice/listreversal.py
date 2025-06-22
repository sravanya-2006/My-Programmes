def list_reversal():
    num_elements = int(input("enter number of elements"))
    numbers = []
    for i in range(num_elements):
        num = int(input(f"enter number {i+1}: "))
        numbers.append(num)
    new_list = numbers[::-1]
    print(new_list)
list_reversal()
        
      