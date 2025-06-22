package learn;
public class patterns {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++) {
             for (int j=1; j<=4; j++) {
            System.out.print("* ");
           }
           System.out.println();
        }
    }
}




// public class patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;

//         //outer loop
//         for(int i=1; i<=n; i++) {
//             //inner loop
//             for(int j=1; j<=m; j++) {
//                 //cell-> (i,j)
//                 if(i == 1 || j == 1 || i ==n || j == m) {
//                     System.out.print("*");
//                 }else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// public class patterns {
//     public static void main(String[] args) {
//          for (int i=0; i<=4; i++) {
//             for (int j=0; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//          }
//     }
// }



// public class patterns {
//     public static void main(String[] args) {
//         for ( int i=4; i>=0; i--) {
//             for (int j=i; j>=0; j--) {
//                 System.out.print("*");
//             }
//         System.out.println(" ");
//         }
//     }
// }



// public class patterns {
//     public static void main(String[] args) {
//         for ( int i = 1; i<=4; i++) {
//             for(int j=1; j<=4-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }

