
import java.util.*;
public class slantingpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=5;j++) {
                System.out.print("*");
            }
           
        System.out.println();
        }
    }
}
