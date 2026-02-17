import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert text to uppercase using charAt()
    public static String manualToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is lowercase (a-z), convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);  // Subtract 32 to get uppercase
            }
            result += ch;  // Append to result string
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Convert manually
        String manualUpper = manualToUpperCase(text);

        // Convert using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare results
        boolean areEqual = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nManual conversion: " + manualUpper);
        System.out.println("Built-in conversion: " + builtInUpper);
        System.out.println("Are both results equal? " + areEqual);

        sc.close();
    }
}
