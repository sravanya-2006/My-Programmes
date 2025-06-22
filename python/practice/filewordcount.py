#count number of times a word is present.
f = open("file.txt","r")
d = f.read()
t = d.split()
s = input("enter a word: ")
ct = 0
for i in t:
    if i==s:
        ct += 1
print("no of times the word is present",ct)
