package week2.oop_calculator;

public class OopCalculator {
        // Private field to store the result of the calculation
        private int result;

        // Constructor that initializes the result to 0
        public OopCalculator() {
            result = 0;
        }

        public void plus(int number) {
            result += number;
        }
        public void minus(int number) {
            result -= number;
        }
        public void multiply(int number) {
            result *= number;
        }
        public void divide(int number) {
            if (number != 0) {
                result /= number;
            } else {
                System.out.println("Cannot divide by zero.");
            }
        }

        public int getResult() {
            return result;
        }
    }

