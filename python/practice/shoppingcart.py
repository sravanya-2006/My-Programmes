def total_cost(list):
    sum = 0
    for i in list:
        sum += i
    return sum
        
def main():
    list = [120,50,30,200,80]
    for i in list:
        if i > 100:
            i = i - (10/100)*i
        return list
    cost = total_cost(list)
    print(cost)
main()
