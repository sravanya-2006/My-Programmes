maximum = int(input(" please enter the maximum value: "))
total = 0
number = 1

while number <= maximum:
    if(number % 2 == 0):
        print("{0}".format(number))
        total = total + number
    number = number + 1
print("The Sum of Even Numbers from 1 to N = {0}".format(total))
