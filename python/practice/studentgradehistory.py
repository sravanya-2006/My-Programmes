def average_grade(p):
    average_grade = sum(p.values()) / len(p)
    print(f"Average Grade: {average_grade:.2f}")

def highest_value(p):
    max_key = max(p, key=p.get)
    max_value = p[max_key]
    print(f"Highest Grade: {max_value}")

def lowest_value(p):
    min_key = min(p, key=p.get)
    min_value = p[min_key]
    print(f"Lowest Grade: {min_value}")

def add_grade(p):
    name = input("Enter the name: ")
    grade = float(input("Enter the grade: "))
    p[name] = grade
    print(f"Grade added: {p}")

def grade_history(p):
    for key, value in p.items():
        print(f'{key}: {value}')

def main():
    p = {"ash": 10, "srav": 20, "sneha": 30, "raash": 40, "pri": 50}
    average_grade(p)
    highest_value(p)
    lowest_value(p)
    add_grade(p)
    grade_history(p)

if __name__ == "__main__":
    main()
