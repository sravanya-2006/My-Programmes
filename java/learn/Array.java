package learn;

public class Array {
    public static void main(String[] args) {

        // Food[] refrigerator = new Food[3];
         
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Burger");
        Food food3 = new Food("Pasta");
        Food food4 = new Food("Maggie");

        Food[] refrigerator = {food1,food2,food3,food4};
        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;
        
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
        System.out.println(refrigerator[3].name);
    }
}

class Food {
   
    String name;
    Food(String name) {
        this.name = name;

    }
}