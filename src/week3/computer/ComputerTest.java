package week3.computer;
import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        // Create example computer objects
        Computer computer1 = new Computer("Dell", 15.6, true);
        computer1.setPurchasePrice(500);
        computer1.setSellingPrice(700);
        computer1.setRamSizeGB(256);

        Computer computer2 = new Computer("HP", 13.3, false);
        computer2.setPurchasePrice(600);
        computer2.setSellingPrice(950);

        Computer computer3 = new Computer("Lenovo", 17.0, true);
        computer3.setPurchasePrice(700);
        computer3.setSellingPrice(1000);

        Computer computer4 = new Computer("Asus", 14.0, false);
        computer4.setPurchasePrice(550);
        computer4.setSellingPrice(750);

        Computer computer5 = new Computer("Acer", 15.6, true);
        computer5.setPurchasePrice(650);
        computer5.setSellingPrice(850);

        // Create an ArrayList of computers
        ArrayList<Computer> computerList = new ArrayList<>();
        computerList.add(computer1);
        computerList.add(computer2);
        computerList.add(computer3);
        computerList.add(computer4);
        computerList.add(computer5);

        // Print properties of the computer
        System.out.println(computer1);

        // Perform memory upgrade
        computer1.setRamSizeGB(computer1.getRamSizeGB() * 2);
        System.out.println("Computer after memory upgrade: " + computer1);

        // Create a ComputerShop object
        ComputerShop shop = new ComputerShop(computerList);

        // Calculate and print potential profit
        System.out.println("Profit for the computer1: $" + computer1.calculateProfitForEach());
        System.out.println("Profit for the computer2: $" + computer2.calculateProfitForEach());
        System.out.println("Profit for the computer3: $" + computer3.calculateProfitForEach());
        System.out.println("Profit for the computer4: $" + computer4.calculateProfitForEach());
        System.out.println("Profit for the computer5: $" + computer5.calculateProfitForEach());
        System.out.println("Potential profit of the shop: $" + shop.calculateProfit());

    }
    }


