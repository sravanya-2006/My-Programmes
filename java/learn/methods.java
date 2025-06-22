package learn;

public class methods {
    public static void main(String[] args) {

        float x = 3;
        float y = 4;

        System.out.println("sum is "+ add(x,y));
        System.out.println("difference is "+ sub(x,y));
        System.out.println("product is "+ mul(x,y));
        System.out.println("quotient is "+ div(x,y));
    }
    static float add(float x,float y) {
        return x + y;
    }
    static float sub(float x,float y) {
        if(x > y) {
            return x-y;
        }else {
            return y-x;
        }
    }
    static float mul(float x,float y) {
        return x*y;
    }
    static float div(float x,float y) {
        return x/y;
    }
}
