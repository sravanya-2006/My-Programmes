#when we open file with with open
# it will be closed automatically

with open('test.txt')  as file:
    print(file.read())
    
# print(file.closed)
# to check if file is closed or not 

'''if there is file name is wrong '''
try:
    with open('test.tx') as file:
        print(file.read())
except FileNotFoundError:
    print("That file was not found :( ")
    
