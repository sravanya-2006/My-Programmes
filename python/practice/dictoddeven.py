def odd_even(n):
    if n % 2 == 0:
        return "even"
    else:
        return "odd"

def create_dictionary(numbers):
    result_dict = {}
    for num in numbers:
        result_dict[num] = odd_even(num)
    return result_dict
    
def num_checking():
    num = int(input("Enter number of values: "))
    numbers = []
    for i in range(num):
        n = int(input(f"Enter the number {i+1}: "))
        numbers.append(n)
    result_dict = create_dictionary(numbers)
    print("Resultant Dictionary:")
    print(result_dict)

num_checking()


       
       
    