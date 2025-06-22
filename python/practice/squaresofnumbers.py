def square_list():
    squares = []
    for i in range(1, 30):
        squares.append(i ** 2)
    return squares

result = square_list()
print(result)