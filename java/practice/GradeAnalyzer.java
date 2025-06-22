package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input grades from the user
        System.out.println("Enter grades (type 'done' when finished):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            } else {
                try {
                    int grade = Integer.parseInt(input);
                    grades.add(grade);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid grade or 'done' to finish.");
                }
            }
        }

        // Analyze grades
        if (!grades.isEmpty()) {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            double average = (double) sum / grades.size();
            System.out.println("Average grade: " + average);
        } else {
            System.out.println("No grades entered.");
        }

        scanner.close();
    }
}

