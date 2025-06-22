#printing words of a particular letter
fp = open("file.txt","r")
d = fp.read() # d = fp.readlines() this function is used to read number of lines
t = d.split()
s = input("enter a letter: ")
for i in t:
    if i[0] == s[0]:
        print(i)
    