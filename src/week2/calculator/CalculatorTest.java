package week2.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        // Perform operations
        myCalculator.plus(12);
        myCalculator.minus(2);
        myCalculator.multiply(2);
        myCalculator.divide(0);

        // Print the final result
        System.out.println(myCalculator.getResult()); // Output: 4
    }
}