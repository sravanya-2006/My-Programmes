package learn;
public class loops {
    public static void main(String[] args) {
       for ( int i=0; i<11; i++) {
          System.out.println(i);
       }

       int i = 0;
       while (i<11) {
        System.out.println(i);
        i = i + 1;
       }

       int j = 0;
       do {
          System.out.println(j);
          j = j + 1;
       }while (j < 11);
    }

}


