package learn;

public class constructors {
    public static void main(String[] args) {
        Human human1 = new Human("Ram",50,65);
        Human human2 = new Human("Krish",24,55);
        System.out.println(human1.name);
        System.out.println(human2.name);
    }
    static class Human {
        String name;
        int age;
        double weight;
        Human(String name,int age,double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}
