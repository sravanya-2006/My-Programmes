class Operations{
    static int  operation(int a, int b, int c){
        return a+b+c;
    }
    static double operation(double a,double b,double c) {
       return a-b;
    }
    static double operation(double b,int a, int c){
        return a*b*c;
    }
    static double operation(double a,double b){
        return a/b;
    }
}
public class mathoperations {
    public static void main(String[] args) {
        System.out.println(Operations.operation(1, 2, 3));
        System.out.println(Operations.operation(3.0, 2.9,5.0));
        System.out.println(Operations.operation(1.0, 2, 3));
        System.out.println(Operations.operation(4.0,2.0));
    }
}