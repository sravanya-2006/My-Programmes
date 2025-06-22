package learn;

//we can call a static method in a non static method
//but we cant call a non static in a static method

public class SStatic {
        public static void staticMethod() {
            System.out.println("This is a static method.");
        }
    
        public void nonStaticMethod() {
            System.out.println("This is a non-static method.");
            
            // Calling the static method from within the non-static method
            staticMethod();
        }
    
        public static void main(String[] args) {
            SStatic obj = new SStatic();
            obj.nonStaticMethod(); // This will invoke both non-static and static methods
        }
}
