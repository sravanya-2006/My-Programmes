def string_Rotation(a,b):
    reversed_b = b[::-1]
    if a == reversed_b:
        print("True")
    else:
        print("False")
    return string_Rotation
a = input("enter a string: ")
b = input("reversed string of a: ")
string_rotation = string_Rotation(a,b)
print(string_rotation)
