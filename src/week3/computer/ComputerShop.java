package week3.computer;

import java.util.ArrayList;

public class ComputerShop {
    private ArrayList<Computer> computers;

    public ComputerShop(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public double calculateProfit() {
        double totalProfit = 0;
        for (Computer computer : computers) {
            totalProfit += computer.calculateProfitForEach();
        }
        return totalProfit;
    }
}