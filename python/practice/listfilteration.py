def list_filtering():
    num_elements = int(input("enter number of elements: "))
    numbers = []
    for i in range(num_elements):
        num = int(input(f"enter number {i+1}: "))
        numbers.append(num)
    list = []
    for i in numbers:
       if i%2==0:
          list.append(i)
    print(f'old list: {numbers}')
    print(f'new list: {list}')
list_filtering()
       
    
    