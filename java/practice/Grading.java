
import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 3 persons: ");
        int person_1 = sc.nextInt();
        int person_2 = sc.nextInt();
        int person_3 = sc.nextInt();
        int gradeSum = person_1 + person_2 + person_3;
        sc.close();

        double averageGrade;

        if (gradeSum >= 270) {
            averageGrade = 4.0;
        } else if (gradeSum >= 240) {
            averageGrade = 3.5;
        } else if (gradeSum >= 210) {
            averageGrade = 3.0;
        } else if (gradeSum >= 180) {
            averageGrade = 2.5;
        } else if (gradeSum >= 150) {
            averageGrade = 2.0;
        } else {
            averageGrade = 1.0;
        }

        System.out.println("The average grade is: " + averageGrade);
    }
}