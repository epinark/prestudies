package week2.using_methods;

public class UsingMethods {
     public static void printMultipliedArray(int[] numbers, int multiplier) {
         int newMultiplier = multiplier + 1;

         for (int i = 0; i < numbers.length; i++) {
             numbers[i] *= newMultiplier;
             System.out.print(numbers[i] + " ");
         }
         System.out.println();
     }

    public static void main(String[] args) {

        int[] numbers = new int[] {2, 2, 10, 11, 10};
        int multiplier = 2;

        printMultipliedArray(numbers, multiplier);

        System.out.println("Numbers array after printMultipliedArray: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Original multiplier: " + multiplier);
    }
}

