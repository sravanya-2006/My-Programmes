def if_Palidrome(n):
    string = str(n)
    reversed_string = string[::-1]
    return string == reversed_string
n = int(input("enter a number: "))
palidrome = if_Palidrome(n)
if palidrome:
        print("palidrome number")
else:
        print("not palidrome")
print(palidrome)
