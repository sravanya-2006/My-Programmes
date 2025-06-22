package learn;

interface Student {
    void setStudent(int reg_no, String student_name, String student_address);
    void displayStudent();
}

interface Faculty {
    void setFaculty(int faculty_id, String faculty_name, String faculty_address);
    void displayFaculty();
}

interface College extends Student, Faculty {
    void setCollege(int college_code, String college_name, String college_address);
    void displayCollege();
}

public class Sample implements College {
    int reg_no, faculty_id, college_code;
    String student_name, student_address, faculty_name, faculty_address, college_name, college_address;

    public void setStudent(int reg_no, String student_name, String student_address) {
        this.reg_no = reg_no;
        this.student_name = student_name;
        this.student_address = student_address;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + reg_no);
        System.out.println("Student Name: " + student_name);
        System.out.println("Student Address: " + student_address);
    }

    public void setFaculty(int faculty_id, String faculty_name, String faculty_address) {
        this.faculty_id = faculty_id;
        this.faculty_name = faculty_name;
        this.faculty_address = faculty_address;
    }

    public void displayFaculty() {
        System.out.println("Faculty ID: " + faculty_id);
        System.out.println("Faculty Name: " + faculty_name);
        System.out.println("Faculty Address: " + faculty_address);
    }

    public void setCollege(int college_code, String college_name, String college_address) {
        this.college_code = college_code;
        this.college_name = college_name;
        this.college_address = college_address;
    }

    public void displayCollege() {
        System.out.println("College Code: " + college_code);
        System.out.println("College Name: " + college_name);
        System.out.println("College Address: " + college_address);
    }

    public static void main(String arg[]) {
        Sample obj = new Sample();
        obj.setStudent(237201, "rama", "chennai");
        obj.setFaculty(420, "guan", "delhi");
        obj.setCollege(1201, "vitap", "amaravati");
        obj.displayStudent();
        obj.displayFaculty();
        obj.displayCollege();
    }
}
