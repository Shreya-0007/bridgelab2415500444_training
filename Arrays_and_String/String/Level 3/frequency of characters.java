import java.util.Scanner;

class CharFrequency_NoFunc {
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

        // -------- FREQUENCY ARRAY --------
        int[] freq = new int[256];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // -------- STORE UNIQUE CHARACTERS + FREQUENCY --------
        // Max possible = length
        String[][] result = new String[length][2];
        int count = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                result[count][0] = String.valueOf(ch);
                result[count][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // mark as processed
                count++;
            }
        }

        // -------- DISPLAY RESULT --------
        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        sc.close();
    }
}
