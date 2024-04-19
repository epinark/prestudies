package week1.metropolis;
import java.util.Scanner;

public class Metropolis {

    // Function to check whether a city is a metropolis
    public static boolean isMetropolis(String name, boolean isCapital, int population, double taxPerPerson) {
        if (isCapital && population > 100000) {
            return true;
        }
        if (population > 200000 && (taxPerPerson * population) >= 1000000000) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of the city: ");
        String name = scanner.nextLine();

        System.out.print("Is " + name + " a capital ('true' or 'false')? ");
        boolean isCapital = scanner.nextBoolean();

        System.out.print("What is the population of " + name + "? ");
        int population = scanner.nextInt();

        System.out.print("Tax income per inhabitant: ");
        double taxPerPerson = scanner.nextDouble();

        boolean isMetropolis = isMetropolis(name, isCapital, population, taxPerPerson);

        if (isMetropolis) {
            System.out.println(name + " is a metropolis.");
        } else {
            System.out.println(name + " is not a metropolis.");
        }

        scanner.close();
    }
}

