package week1.cylinder;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Circumference: ");
        double c = scanner.nextDouble();
        System.out.print("Height: ");
        double h = scanner.nextDouble();

        double diameter = c / Math.PI;
        double areaOftheLid = Math.PI * ((diameter / 2) * (diameter / 2));
        double areaOftheCasing = c * h;
        double totalArea = 2 * areaOftheLid + areaOftheCasing;
        double volume = areaOftheLid * h;
        System.out.println("Sheet metal area: " + totalArea + "\nVolume: " + volume );

    }
}
