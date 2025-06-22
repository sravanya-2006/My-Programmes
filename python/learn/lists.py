marks = [95,98,97]


print(marks[0])#index 0 marks
print(marks[-3])#index 0 marks
print(marks[0 : 3])#[95,98,97] 

for score in marks:
    print(score)
    
marks.append(99)
marks.insert(1,99)
print(marks)

print(len(marks)) 

i = 0
while i < len(marks):
    print(marks[i])
    i = i + 1
    
marks.clear()#it will clear all the element of marks
print(marks)




