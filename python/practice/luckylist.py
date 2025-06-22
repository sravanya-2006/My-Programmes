def is_prime(n):
    count = 0
    if n<=1:
        return "False"
    for num in range(0,n+1):
        if num > 1:
            for i in range(2,num):
                if (num % i) == 0:
                    break
            else:
                count+=1
      
    

def lucky_list():
    num_elements = int(input("Enter the number of elements: "))
    numbers = []
    
    for i in range(num_elements):
        num = int(input(f"Enter number {i+1}: "))
        numbers.append(num)
    
    count = 0
    for num in numbers:
        if is_prime(num):
            count += 1

    if count % 2 != 0:
        return "You have a lucky collection"
    else: 
        return "You don't have a lucky collection"

result = lucky_list()
print(result)
