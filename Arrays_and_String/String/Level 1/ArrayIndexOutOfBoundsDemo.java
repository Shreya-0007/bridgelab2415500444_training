import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate the exception
    public static void generateException(String[] names) {
        // Accessing invalid index
        System.out.println("Accessing invalid element: " + names[names.length]);
    }

    // Method to handle the exception
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid element: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();

        // Initialize array
        String[] names = new String[size];

        // Take input for names
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        // This will generate exception and stop the program
        // Uncomment to test
        // generateException(names);

        // This will handle exception safely
        handleException(names);

        sc.close();
    }
}
