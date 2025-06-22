
//Student and teacher class
class Teacher {
    void Subject() {
        System.out.println("Math and English");
    }
}

class Students extends Teacher {
    void Subject() {
        System.out.println("English,Science and MAth");
    }
}

class Subjects {
    public static void main(String[] args) {
        Teacher s;
        s = new Teacher();
        s.Subject();
        s = new Students();
        s.Subject();
    }
}
