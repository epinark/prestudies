package week2.maximum_minimum;

public class MaximumMinimum {
        public static void main(String[] args) {

            int[] numbers = new int[] {12, -22, 300, 43, 0};

            int max = numbers[0];
            int min = numbers[0];

            for (int i = 0; i < numbers.length; i++)  {
                int num = numbers[i];

                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }

            System.out.println("Maximum value in the array: " + max);
            System.out.println("Minimum value in the array: " + min);
        }
    }


