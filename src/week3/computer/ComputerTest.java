package week3.computer;
import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        // Create example computer objects
        Computer computer1 = new Computer("Dell", 15.6, true);
        computer1.setPurchasePrice(500);
        computer1.setSellingPrice(700);

        Computer computer2 = new Computer("HP", 13.3, false);
        computer2.setPurchasePrice(600);
        computer2.setSellingPrice(800);

        Computer computer3 = new Computer("Lenovo", 17.0, true);
        computer3.setPurchasePrice(700);
        computer3.setSellingPrice(900);

        // Create an ArrayList of computers
        ArrayList<Computer> computerList = new ArrayList<>();
        computerList.add(computer1);
        computerList.add(computer2);
        computerList.add(computer3);

        // Perform memory upgrade
        computer1.setRamSizeGB(computer1.getRamSizeGB() * 2);
        System.out.println("Computer after memory upgrade: " + computer1);

        // Set purchase and selling prices
        computer1.setPurchasePrice(500);
        computer1.setSellingPrice(700);
        System.out.println("Profit per computer: $" + computer1.calculateProfitForEach());

        // Create a ComputerShop object
        ComputerShop shop = new ComputerShop(computerList);

        // Calculate and print potential profit
        System.out.println("Potential profit of the shop: $" + shop.calculateProfit());
    }
    }


