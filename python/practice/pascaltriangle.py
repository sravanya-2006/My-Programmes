def pascals_triangle(n):
    for i in range(n):
        k = 1
        for j in range(0, n - i):
            print(" ", end=" ")
        for j in range(0, i + 1):
            print(' ',k, end=" ")
            k = k * (i - j) // (j + 1) 
        print()
        
n = int(input('enter number of rows: '))
my_pattern = pascals_triangle(n)
print(my_pattern)

