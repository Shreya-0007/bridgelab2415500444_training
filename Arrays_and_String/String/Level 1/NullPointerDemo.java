public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;   // initialized to null
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;   // initialized to null
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // This will generate exception and crash
        // Uncomment to see the error
        // generateException();

        // This will handle exception safely
        handleException();
    }
}
