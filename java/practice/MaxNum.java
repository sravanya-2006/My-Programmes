
import java.util.*;
public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        if(a>b && a>c) {
            System.out.println("The maximum number is: "+ a);
        }else if (b>a && b>c) {
            System.out.println("The maximum number is: "+ b);
        }else {
            System.out.println("The maximum number is: "+ c);
        }
    }
}
