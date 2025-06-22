

class Report {
    String name;
    String rollnumber;
    int sub1_marks;
    int sub2_marks;
    int sub3_marks;
    
    Report(String name, String rollnumber, int sub1_marks, int sub2_marks, int sub3_marks) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.sub1_marks = sub1_marks;
        this.sub2_marks = sub2_marks;
        this.sub3_marks = sub3_marks;
    }
    
    public void report() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll number: " + rollnumber);
        double percentage = ((sub1_marks + sub2_marks + sub3_marks) / 3.0);
        System.out.println("Percentage: " + percentage);
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Report[] student_repo = new Report[3];
        student_repo[0] = new Report("Rama", "23MIS7293", 90, 99, 70);
        student_repo[1] = new Report("Sita", "23MIS7294", 70, 100, 50);
        student_repo[2] = new Report("Geeta", "23MIS7295", 80, 50, 34);
        System.out.println("Student data ");

        for (int i = 0; i < student_repo.length; i++) {
            student_repo[i].report();
        }
    }
}