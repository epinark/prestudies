package week3.computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerShop {
 private List<Computer> computers;

    public ComputerShop() {
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        this.computers.add(computer);
    }

    public double calculateProfit() {
        double totalProfit = 0;
        for (Computer computer : computers) {
            totalProfit += computer.calculateProfit();
        }
        return totalProfit;
    }
}
