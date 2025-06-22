public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String major;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMajor() {
        return major;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Lakshmi");
        student.setLastName("Sravanya");
        student.setEmail("sravanya@gmail.com");
        student.setPhoneNumber("123-456-7890");
        student.setMajor("Computer Science");

        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Phone Number: " + student.getPhoneNumber());
        System.out.println("Major: " + student.getMajor());
    }
}
