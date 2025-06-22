def count_vowels_and_consonents(input_str):
    vowels = "aeiouAEIOU"
    vowels_count = 0
    consonent_count = 0
    for char in input_str:
        if  char.isalpha():
            if char in vowels:
              vowels_count += 1
            else:
              consonent_count += 1
        else:
           print("enter alphabet")       
    return vowels_count,consonent_count
input_str = input("enter any string: ")
vowels,consonents = count_vowels_and_consonents(input_str)
print(f"number of vowels: {vowels}")
print(f"number of consonents: {consonents}")




    