import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate the exception
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not numeric
        int num = Integer.parseInt(text);
        System.out.println("Converted number: " + num);
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // This will generate the exception and crash
        // Uncomment to see it fail
        // generateException(text);

        // This will handle the exception safely
        handleException(text);

        sc.close();
    }
}
