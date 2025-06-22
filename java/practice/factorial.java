package practice;

public class factorial {
        public static void main(String[] args) {
            float fact = 1;
            for(int i = 1; i <= 5; i++)
            {
                fact *= i;
            }
            System.out.print(fact);
        }
}


