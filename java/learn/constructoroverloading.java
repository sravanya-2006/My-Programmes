package learn;

public class constructoroverloading {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("thick crust","tamato","mozzerella","pepperoni");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings);
    }
}
class Pizza{

    String bread;
    String sauce;
    String cheese;
    String toppings;

    Pizza(String bread,String sauce,String cheese,String toppings) {
     
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
    this.toppings = toppings;
    }
}
