import java.util.Scanner;

class CharFrequencyNested_NoFunc {
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
            // end of string
        }

        // -------- CREATE CHAR ARRAY MANUALLY --------
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = text.charAt(i);
        }

        int[] freq = new int[length];

        // -------- NESTED LOOPS FOR FREQUENCY --------
        for (int i = 0; i < length; i++) {
            freq[i] = 1;  // initial frequency

            if (chars[i] == '0') continue; // already counted duplicate

            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // -------- DISPLAY RESULT --------
        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                System.out.println(chars[i] + "\t\t" + freq[i]);
            }
        }

        sc.close();
    }
}
