#while loop: a statement that will execute it's block of code,
#                as long as it's condition remains true
i = 1  #initialization
while i <=5:   #condition
    print(i)
    i = i + 1  #increment/decrement
    
i = 1
while i <= 5:
    print(i * "*")
    i = i + 1
    
count = 0
while count <= 100:
    print("programming is fun")
    count = count + 1
    
    
#forloop: a statement that will execute it's block of code,
#         a limited amount of times

#basic loop
for i in range(5):
    print(i + 1) 

for i in range(50,100+1,2):
    print(i)
    
#looping through a string
for i in "Lakshmi Sravanya":
    print(i)
   
import time 
for seconds in range(10,0,-1):
    print(seconds)
    time.sleep(1)                  #import time
print("Happy New Year!")
    
#looping through a list
fruits = ['apple','banana','orange']
for fruit in fruits:
    print(fruit)
    
#looping with enumerate
#enumerate allows you to iterate over both the index and the value
colors = ['red','green','blue']
for index,color in enumerate(colors):
    print(f"Index: {index}, Color: {color}")
    
    
#looping with break,continue and pause
'''while loop = unlimited
    for loop = limited'''
    
    
    
    
    
    
    