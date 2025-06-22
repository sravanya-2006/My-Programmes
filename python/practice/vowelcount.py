
def Check_Vow(string, vowels):
    string = string.casefold()
    count = {}.fromkeys(vowels, 0)
    for character in string:
        if character in count:
            count[character] += 1   
    return count


vowels = 'aeiou'
string = "Hi, I love eating ice cream and junk food"
print (Check_Vow(string, vowels))


