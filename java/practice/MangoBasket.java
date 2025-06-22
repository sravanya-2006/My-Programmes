package practice;

class MangoBasket {
    private int mangoes = 5; // Initial number of mangoes

    // Synchronized method to pick mangoes
    public synchronized void pickMangoes(String brotherName, int mangoesToPick) {
        if (mangoes >= mangoesToPick) {
            System.out.println(brotherName + " is picking " + mangoesToPick + " mangoes.");
            mangoes -= mangoesToPick;
            System.out.println("Remaining mangoes in the basket: " + mangoes);
        } else {
            System.out.println(brotherName + " cannot pick mangoes. Not enough mangoes left.");
        }
    }
}

class Brother extends Thread {
    private String name;
    private MangoBasket basket;
    private int mangoesToPick;

    public Brother(String name, MangoBasket basket, int mangoesToPick) {
        this.name = name;
        this.basket = basket;
        this.mangoesToPick = mangoesToPick;
    }

    @Override
    public void run() {
        basket.pickMangoes(name, mangoesToPick);
    }
}

public class MangoBasket {
    public static void main(String[] args) {
        MangoBasket basket = new MangoBasket();

        // Create three brothers
        Brother brother1 = new Brother("Brother A", basket, 3);
        Brother brother2 = new Brother("Brother B", basket, 2);
        Brother brother3 = new Brother("Brother C", basket, 4); // More than available mangoes

        // Start threads for each brother
        brother1.start();
        brother2.start();
        brother3.start();
    }
}
