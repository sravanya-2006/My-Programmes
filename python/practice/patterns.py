#right angled triangle
height = int(input("enter the height of the triangle: "))
for i in range(1,height+1):
    for j in range(i):
       print("*", end= "")
    print()

print()
    
#inverted right angled triangle
rows = 5
for i in range(rows,0,-1):
    for j in range(i):
        print("i", end = "")
    print()
    
print()
    
#diamond
rows = 5
for i in range(1, rows + 1):
    spaces = rows - i
    print(" " * spaces + "*" * (2 * i - 1))

for i in range(rows - 1, 0, -1):
    spaces = rows - i
    print(" " * spaces + "*" * (2 * i - 1))
    
print()

#pyramid
rows = 5
for i in range(1, rows + 1):
    spaces = rows - i
    print(" " * spaces + "*" * (2 * i - 1))
    
print()

#hollow pyramid pattern
rows = 5
for i in range(1, rows + 1):
    spaces = rows - i
    if i == 1 or i == rows:
        print(" " * spaces + "*" * (2 * i - 1))
    else:
        print(" " * spaces + "*" + " " * (2 * (i - 1) - 1) + "*")
        
print()
        
#hover glass pattern
def print_hourglass(rows):
    for i in range(rows, 0, -1):
        spaces = rows - i
        print(" " * spaces + "*" * (2 * i - 1))

    for i in range(2, rows + 1):
        spaces = rows - i
        print(" " * spaces + "*" * (2 * i - 1))

# Example: Rows = 5
rows = 5
print_hourglass(rows)

print()


