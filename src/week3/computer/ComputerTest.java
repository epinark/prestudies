package week3.computer;
import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        // Part I: Creating computer objects and testing
        Computer computer1 = new Computer();
        Computer computer2 = new Computer("HP", 15.6, true);
        Computer computer3 = new Computer("Dell", 3000, 8, 500, 4, "Laptop", 17.3, true, 800, 1200);

        computer1.setSellingPrice(1000);
        computer1.setPurchasePrice(800);
        computer2.setSellingPrice(1000);
        computer2.setPurchasePrice(500);

        // Print computers
        System.out.println("Computer 1: " + computer1);
        System.out.println("Computer 2: " + computer2);
        System.out.println("Computer 3: " + computer3);

        // Part II: Memory upgrade and profit calculation
        computer3.doubleRamSize();
        System.out.println("After memory upgrade: " + computer3);
        System.out.println("Profit for Computer 3: $" + computer3.calculateProfit());

        // Part III: Computer shop and profit calculation
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);

        ComputerShop shop = new ComputerShop(computers);
        System.out.println("Total potential profit: $" + shop.calculateProfit());
    }
}



