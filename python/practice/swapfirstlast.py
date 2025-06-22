def swap_firstlast_digits(n):
    number = str(n)
    list=[]
    for i in number:
        list.append(i)
    temp = list[0]
    list[0] = list[-1]
    list[-1] = temp
    swapped_number = int(''.join(list))
    return swapped_number
n = int(input("enter any number: "))
swapped_number = swap_firstlast_digits(n)
print(swapped_number)
