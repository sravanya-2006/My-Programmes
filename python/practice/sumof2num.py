#without using function
first = input("enter the first number: ")
second = input("enter the second number: ")

sum = int(first) + int(second)
print("the sum is: " + str(sum))

#using function:
def sum_numbers(a,b):
    sum = a + b
    return sum
a = int(input("enter any number: "))
b = int(input("enter any number: "))
sum = sum_numbers(a,b)
print("the sum of two numbers are: ",sum)