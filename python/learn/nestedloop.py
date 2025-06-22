#nested loops = The "inner loop" will finish all of it's iterations before
#                finishing one iteration of the "outer loop"

#to print rectangle or square
rows = int(input("How many rows?: "))
columns = int(input("How many columns?: "))
symbol = input("Enter a symbol to use: ")

for i in range(rows):
    for j in range(columns):
        print(symbol, end = "")
    print()
    
#nested loop = A loop within another loop (outer, ineer)
#              outer loop:
#                  inner loop:
for x in range(3):
    for y in range(1,10):
      print(y, end="")
    print()
    
    
    
#example:
for i in range(1,4):
    j = 0
    while j < i:
        print(j,end=" ")
        j+=1
    print()
print("Done")


 
 
 
#loop