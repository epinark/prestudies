package week2.string_manipulation;

public class StringManipulation {
    public static void main(String[] args) {
        String text = "Everybody said, it can’t be done. Then came one who did not know that and just made it.";

        // Retrieve the two uppercase letters from the text
        char uppercaseLetter1 = text.charAt(0);
        char uppercaseLetter2 = text.charAt(34);
        System.out.println("Two uppercase letters from the text: " + uppercaseLetter1 + ", " + uppercaseLetter2);

        // Compare the text with my name using compareTo
        String myName = "Esra";
        int comparisonResult = text.compareTo(myName);
        System.out.println("Comparison of text with your name: " + comparisonResult);

        // Concatenate my first and last name using concat or +
        String firstName = "Esra";
        String lastName = "Berkus";
        String fullNameConcat = firstName.concat(" ").concat(lastName);
        String fullNamePlus = firstName + " " + lastName;
        System.out.println("Concatenated full name using concat: " + fullNameConcat);
        System.out.println("Concatenated full name using +: " + fullNamePlus);

        // Check if the words "made" and "Java" are present using contains
        boolean containsMade = text.contains("made");
        boolean containsJava = text.contains("Java");
        System.out.println("Contains 'made': " + containsMade);
        System.out.println("Contains 'Java': " + containsJava);

        // Compare two strings for equality using equals
        boolean isEqual = text.equals("Everybody said, it can’t be done. Then came one who did not know that and just made it.");
        System.out.println("Is equal to original text: " + isEqual);

        // Output the index of the first occurrence of "d"
        int indexOfD = text.indexOf('d');
        System.out.println("Index of first occurrence of 'd': " + indexOfD);

        // Check for an empty string
        boolean isEmpty = text.isEmpty();
        System.out.println("Is the string empty: " + isEmpty);

        // Check a declared string for null
        String declaredString = null;
        boolean isDeclaredStringNull = declaredString == null;
        System.out.println("Is the declared string null: " + isDeclaredStringNull);

        // Output the length of the text using length
        int textLength = text.length();
        System.out.println("Length of the text: " + textLength);

        // Extract the words "said" and "made" using substring
        String wordSaid = text.substring(10, 14);
        String wordMade = text.substring(61, 65);
        System.out.println("Extracted word 'said': " + wordSaid);
        System.out.println("Extracted word 'made': " + wordMade);
    }
}
