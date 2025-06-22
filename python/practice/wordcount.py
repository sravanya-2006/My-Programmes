def word_count_in_sentence(sentence):
    word = sentence.split()
    count = len(word)
    return count
sentence = input("ener a sentence: ")
word_Count = word_count_in_sentence(sentence)
print(word_Count)
