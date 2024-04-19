package week1.geometry;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value b: ");
        double b = scanner.nextDouble();

        double rectangleArea = a * b;
        double rectanglePerimeter = 2 * (a + b);

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangleArea);
        System.out.println("Perimeter: " + rectanglePerimeter);

        double triangleArea = 0.5 * a * b;
        double hypotenuse = Math.sqrt(a * a + b * b);
        double trianglePerimeter = a + b + hypotenuse;

        System.out.println("\nRight Triangle:");
        System.out.println("Area: " + triangleArea);
        System.out.println("Perimeter: " + trianglePerimeter);
    }

}
