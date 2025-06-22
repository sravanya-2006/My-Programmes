package lab;

import java.util.Scanner;

// CheckedScoreException class
class CheckedScoreException extends Exception {
    public CheckedScoreException(String message) {
        super(message);
    }
}

// TestScore class
class TestScore {
    private int studentId;
    private double score;

    public TestScore(int studentId, double score) throws CheckedScoreException {
        if (!isValidScore(score)) {
            throw new CheckedScoreException("Invalid score: " + score);
        }
        this.studentId = studentId;
        this.score = score;
    }

    private boolean isValidScore(double score) {
        return score >= 0 && score <= 100;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Score: " + score;
    }
}

// Main class
public class ExceptionHandling3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestScore[] testScores = new TestScore[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student ID: ");
            int studentId = scanner.nextInt();
            System.out.print("Enter test score: ");
            double score = scanner.nextDouble();

            try {
                testScores[i] = new TestScore(studentId, score);
                System.out.println("Test score stored successfully: " + testScores[i]);
            } catch (CheckedScoreException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Test score not stored.");
            }
        }
    }
}
