package practice.college.secondyear;

import practice.college.quiz.finalyear;



public class SecondYearStudent {
    public static void main(String[] args) {
        finalyear secondYearStudent = new finalyear(123, "John Doe", 2, "Quiz");
        secondYearStudent.enroll();
        System.out.println(secondYearStudent.getEnrolmentMessage());
    }
}


