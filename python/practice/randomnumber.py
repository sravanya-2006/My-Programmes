import random
number = random.randint(0,100)
print("guess a number between 0 and 100")
guess = -1
while guess != number:
    guess = int(input("guess: " ))
    if(guess == number):
       print("your guess is correct")
    elif(guess > number):
       print("your guess is too high")
    else:
       print("your guess is too low")