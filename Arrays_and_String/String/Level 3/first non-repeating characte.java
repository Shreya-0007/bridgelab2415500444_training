import java.util.Scanner;

class FirstNonRepeating_NoFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------- INPUT --------
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // -------- FIND LENGTH WITHOUT length() --------
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // end reached
        }

        // -------- FREQUENCY ARRAY (256 ASCII) --------
        int[] freq = new int[256];

        // Count frequencies
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // -------- FIND FIRST NON-REPEATING --------
        char firstNonRepeating = 0;
        boolean found = false;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                firstNonRepeating = ch;
                found = true;
                break;
            }
        }

        // -------- DISPLAY RESULT --------
        if (found) {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
