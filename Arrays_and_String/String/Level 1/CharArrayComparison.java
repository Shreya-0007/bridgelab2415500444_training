import java.util.Scanner;

public class CharArrayComparison {

    // Method to create char array manually using charAt()
    public static char[] manualToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Create char arrays
        char[] manualArray = manualToCharArray(text);
        char[] builtInArray = text.toCharArray();

        // Compare arrays
        boolean areEqual = compareCharArrays(manualArray, builtInArray);

        // Display results
        System.out.print("\nManual char array: ");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in char array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + areEqual);

        sc.close();
    }
}
