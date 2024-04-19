package week1.triangles;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How large should the triangles be? ");
        int triangleSize = scanner.nextInt();

        System.out.print("How many triangles would you like? ");
        int numberOfTriangles = scanner.nextInt();

        for (int i = 0; i < numberOfTriangles; i++) {
            for (int j = 1; j <= triangleSize; j++) {
                for (int k = 0; k < j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i < numberOfTriangles - 1) {
                System.out.println();
            }
        }

    }
}
