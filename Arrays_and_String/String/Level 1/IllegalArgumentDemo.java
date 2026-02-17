import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate the exception
    public static void generateException(String text) {
        // Here start index > end index
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // This will generate the exception and stop program
        // Uncomment to see it crash
        // generateException(text);

        // This will handle the exception safely
        handleException(text);

        sc.close();
    }
}
