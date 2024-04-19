package week1.christmas_tree;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How high should the tree be?");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the current line
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        // Draw the trunk of the tree (one line)
        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        }

    }

