package week2.comparing_strings;

public class ComparingStrings {
    public static void main(String[] args) {
        String str1 = "Comparison";
        String str2 = "Comparison";

        // Compare using the equals method
        boolean equalsResult = str1.equals(str2);
        System.out.println("Using equals method (literals): " + equalsResult);

        // Compare using the == operator
        boolean doubleEqualsResult = str1 == str2;
        System.out.println("Using == operator (literals): " + doubleEqualsResult);

        // Create the strings with constructor
        String str3 = new String("Comparision");
        String str4 = new String("Comparision");

        // Compare using the equals method
        boolean doesEqual = str3.equals(str4);
        System.out.println("Using equals method (constructors): " + doesEqual);

        // Compare using the == operator
        boolean doesDoubleEqual = str3 == str4;
        System.out.println("Using == operator (constructors): " +doesDoubleEqual);
    }
}
