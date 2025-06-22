def anagram_checker(a,b):
    frequency_a = {}
    frequency_b = {}
    for char in a:
        char_lower = char.lower()
        if char_lower.isalpha():
               if char_lower in frequency_a:
                  frequency_a[char_lower] += 1
               else:
                  frequency_a[char_lower] = 1
    for char in b:
        char_lower = char.lower()
        if char_lower.isalpha():
               if char_lower in frequency_b:
                  frequency_b[char_lower] += 1
               else:
                  frequency_b[char_lower] = 1
    if frequency_a == frequency_b:
        print("True")
    else:
        print("False")
        
a = input("enter a string: ")
b = input("enter a string: ")
anagrams = anagram_checker(a,b)
if anagrams:
    print("The two strings are anagrams")
else:
    print("The given strings are not anagrams")

