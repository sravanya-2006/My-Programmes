#multiplication table in pythn
n = int(input())
for multiple in range(1,11):
    for number in range(1, n+1):
        print("%2d"%(number*multiple), end =' ')
    print()
    