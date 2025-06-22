def diamond_shape(n):
    num = 1
    for i in range(1,n+1):
       print(" "*(n-i)*2,end=" ")
       for j in range(1,i*2):
           print(num,end=" ")
           num+=1
       print()
    num -= 2
    for i in range(n-1,0,-1):
       print(" "*(n-i)*2,end=" ")
       for j in range(1,i*2):
           print(num+2,end=" ")
           num+=1
       print()

n = 2
my_pattern = diamond_shape(n)
print(my_pattern)

