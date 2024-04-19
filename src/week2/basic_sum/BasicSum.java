package week2.basic_sum;

public class BasicSum {
    public static void main(String[] args) {
        int[] numbers = new int[] {12, -22, 300, 43, 0};

        int sumOfNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumOfNumbers = sumOfNumbers + numbers[i];
        }
        System.out.println("The sum is: " + sumOfNumbers);

    }
}
