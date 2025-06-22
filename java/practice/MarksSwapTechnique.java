package practice;

class MarksRectification {
    
    // Method to swap marks between two students
    public void swap(int[] marks, int index1, int index2) {
        int temp = marks[index1];
        marks[index1] = marks[index2];
        marks[index2] = temp;
    }

    // Method to swap marks among three students
    public void swap(int[] marks, int index1, int index2, int index3) {
        int temp = marks[index1];
        marks[index1] = marks[index2];
        marks[index2] = marks[index3];
        marks[index3] = temp;
    }
}
public class MarksSwapTechnique {
    public static void main(String[] args) {
        int[] marks = {90, 70, 85, 75, 55}; // Initial marks

        MarksRectification rectifier = new MarksRectification();

        // Rectify the errors
        rectifier.swap(marks, 0, 1);   // Swap marks of Ram and Samantha
        rectifier.swap(marks, 2, 3, 4); // Swap marks of Amar, Antony, and Ajay

        // Display corrected marks
        System.out.println("Corrected Marks:");
        System.out.println("Ram: " + marks[0]);
        System.out.println("Samantha: " + marks[1]);
        System.out.println("Amar: " + marks[2]);
        System.out.println("Antony: " + marks[3]);
        System.out.println("Ajay: " + marks[4]);
    }
}
