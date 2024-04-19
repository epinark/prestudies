package week1.input_output;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + ", Welcome to the training!");

    }
}