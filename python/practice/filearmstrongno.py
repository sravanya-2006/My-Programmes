#number is armstrong number or not 
fp = open("file.txt","r")
d = fp.read()
t = d.split()
for i in range(1,500):
    c = len(t)
    temp = i
    sum = 0
    while i > 0:
        rem = i % 10
        sum = sum + rem**c
        num = i/10
    if sum == temp:
        fp.write(str(temp))

    