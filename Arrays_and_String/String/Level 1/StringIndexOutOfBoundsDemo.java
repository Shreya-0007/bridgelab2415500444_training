import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate the exception
    public static void generateException(String text) {
        // Access index beyond string length
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // This will generate exception and stop the program
        // Uncomment to see it
        // generateException(text);

        // This will handle the exception safely
        handleException(text);

        sc.close();
    }
}
