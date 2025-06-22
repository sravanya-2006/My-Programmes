#count of upper and lower cases from a file
fp = open("file.txt","r")
data = fp.read()
ch = len(data)
print(ch)
u = 0
l = 0
for i in data:
    if i.isupper():
        u += 1
    if i.islower():
        l += 1
print("lower is: ",l)
print("upper is: ",u)
