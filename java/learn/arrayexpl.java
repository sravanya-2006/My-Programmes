package learn;
import java.util.*;

public class arrayexpl {
    public static void main(String[] args) {

        // //Q: store a roll number
        // int a = 19;

        // //Q: stroe a persons name
        // String name = "lakshmi sravanya";

        // //Q:store 5 roll numbers
        // int roll1= 23;
        // int roll2= 35;
        // int roll3= 25;
        // int roll4= 10;
        // int roll5= 90;

        // //syntax
        // //datatype[] variable_name = new datatype[size];
        // // store 5 roll numbers:
        // int[] rnos = new int[5];
        // //or directly
        // int[] rno2 = {23,24,25,24,24};


        // int[] ros; //declaration of array. ros is getting defined in the stack
        // ros = new int[5]; //actually here object is being created in the memory(heap)
         
        // //System.out.println(ros[1]);
        // //output: 0

        // String[] arr = new String[4];
        // System.out.println(arr[0]);

        // //to take input
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 34;
        arr[3] = 92;
        arr[4] = 3;
        //[23,45,34,92,3]
        System.out.print(arr[3]);

        //input using for loops
        for (int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();

        }
        for (int i=0; i<arr.length; i++) {
           System.out.println(arr[i] + " ");

        }
         

         
    }
}
