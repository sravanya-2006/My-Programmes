package practice;

/**
 * interface
 */
 public interface AdvancedArithematic {
     int divisor_sum(int n); 
    
}

class MyCalculator implements AdvancedArithematic {
  public int divisor_sum(int n) {
    int sum = 0;
    for(int i=1;i<n;i++) {
        if(n%i == 0) {
           sum+=i;
        }
    }
    return sum;
  }
}

public class Maggie {
  public static void main(String[] args) {
      MyCalculator calculator = new MyCalculator();
      int n = 6;
      int sum = calculator.divisor_sum(n);
      System.out.println("Sum of divisors of " + n + " is: " + sum);
  }
}



