package learn;

public class overloaded {
    public static void main(String[] args) {
        int x = add(2, 3);
        int y = add(2, 3, 4);
        int z = add(2, 3, 4, 5);
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    static int add(int a, int b) {
        System.out.println("This is method overloading #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is method overloading #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is method overloading #3");
        return a + b + c + d;
    }
}