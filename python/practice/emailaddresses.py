num_students = int(input("Enter the number of students: "))
student_data = {}
for i in range(num_students):
    student_name = input(f"Enter the name of student {i + 1}: ")
    favorite_subject = input(f"Enter {student_name}'s favorite subject: ")
    student_data[student_name] = favorite_subject
subject_count = {}
for student in student_data.values():
    if student in subject_count:
        subject_count[student] += 1
    else:
        subject_count[student] = 1
print("\nSummary:")
for subject, count in subject_count.items():
    print(f"{count} student(s) prefer {subject} as their favorite subject.")
    
