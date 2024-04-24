package week3.computer;

public class ComputerTest {
    public static void main(String[] args) {
        // Creating computer objects
        Computer comp1 = new Computer("Dell", 15.6, true, 500, 800);
        Computer comp2 = new Computer("HP", 13.3, false, 450, 700);
        Computer comp3 = new Computer("Apple", 13.3, true, 1200, 1500);


        // Creating ComputerShop object
        ComputerShop shop = new ComputerShop();

        // Adding computers to the shop
        shop.addComputer(comp1);
        shop.addComputer(comp2);
        shop.addComputer(comp3);

        // Calculating profit
        double profit = shop.calculateProfit();

        // Printing result
        System.out.println("Profit: $" + profit);
    }
}


