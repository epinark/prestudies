package week2.calculator;

public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    }
    public void plus (int number) {
        result += number;
    }

    public void minus (int number) {
        result -= number;
    }

    public void multiply (int number) {
        result *= number;
    }

    public void divide (int number) {
        if (number != 0) {
        result /= number;
    } else {
            System.out.println("number cannot be divided by 0...");
        }

}
    public int getResult() {
        return result;
    }
}

