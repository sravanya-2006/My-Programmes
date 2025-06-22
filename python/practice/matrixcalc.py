import numpy as np

def input_matrix():
    rows = int(input("Enter the number of rows: "))
    cols = int(input("Enter the number of columns: "))
    
    matrix = []
    for i in range(rows):
        row = [float(input(f"Enter element [{i+1},{j+1}]: ")) for j in range(cols)]
        matrix.append(row)
    
    return np.array(matrix)

def matrix_calculator():
    print("Matrix Calculator:")
    
    print("\nEnter Matrix A:")
    matrix_a = input_matrix()

    print("\nEnter Matrix B:")
    matrix_b = input_matrix()

    print("\nSelect operation:")
    print("1. Addition")
    print("2. Subtraction")
    print("3. Multiplication")

    choice = int(input("Enter your choice (1/2/3): "))

    if choice == 1:
        result = matrix_a + matrix_b
    elif choice == 2:
        result = matrix_a - matrix_b
    elif choice == 3:
        result = np.dot(matrix_a, matrix_b)
    else:
        print("Invalid choice. Please select a valid operation.")
        return

    print("\nResult:")
    print(result)

if __name__ == "__main__":
    matrix_calculator()
