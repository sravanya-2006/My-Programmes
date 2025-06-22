package practice;

class Student {
    int[] ages = {17, 28, 22, 21, 20};

    public double average() {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}

class Teacher {
    int[] ages = {51, 45, 60, 46, 38};

    public double average() {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}

public class AverageAge {

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        // Thread for students
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                double avg = student.average();
                System.out.println("Average age of students: " + avg);
            }
        });

        // Thread for teachers
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                double avg = teacher.average();
                System.out.println("Average age of teachers: " + avg);
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}
