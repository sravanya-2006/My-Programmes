package Fan;

public class Main {

    public static void main(String[] args) {

    Fan MyFan = new Fan();
    
    //to access the properties
    System.out.println(MyFan.Color);
    System.out.println(MyFan.company);
    System.out.println(MyFan.mode);
    System.out.println(MyFan.speed);

    //to access the methods
    MyFan.start();
    MyFan.rotate();
    MyFan.stop();

}
}