def character_frequency(input_string):
    frequency_dict = {}
    for char in input_string:
        char_lower = char.lower()
        if char_lower.isalpha():
               if char_lower in frequency_dict:
                  frequency_dict[char_lower] += 1
               else:
                  frequency_dict[char_lower] = 1
    for char,frequency in frequency_dict.items():
        print(f"Character '{char}' appears {frequency} time(s)")
input_string = input("enter a string: ")
character_frequency(input_string)



    
    