import java.util.Scanner;

public class LowerCas{

    // Method to convert text to lowercase manually using charAt()
    public static String manualToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is uppercase (A-Z), convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);  // Add 32 to get lowercase
            }
            result += ch;  // Append character
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

        // Take user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Manual conversion
        String manualLower = manualToLowerCase(text);

        // Built-in conversion
        String builtInLower = text.toLowerCase();

        // Compare both
        boolean areEqual = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("\nManual conversion: " + manualLower);
        System.out.println("Built-in conversion: " + builtInLower);
        System.out.println("Are both results equal? " + areEqual);

        sc.close();
    }
}
