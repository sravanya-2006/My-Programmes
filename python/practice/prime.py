'''def prime_numbers(n):
    primes = []
    for num in range(0,n+1):
        if num > 1:
            for i in range(2,num):
                if (num % i) == 0:
                    break
            else:
                primes.append(num)
    return primes
                
n = int(input("enter any number: "))
range_prime = prime_numbers(n)
print("Prime numbers up to",n,"are:", range_prime)'''

def prime_numbers(n):
    for divisor in range(2,n//2 + 1):
        if (n % divisor == 0):
            print("n is not prime")
            break
        else:
           print("n is prime")
n = int(input("enter any number: "))
prime_numbers(n)
            



        