import java.util.Scanner;

class CharFrequencyUnique_NoFunc {
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
            // reached end
        }

        // -------- FIND UNIQUE CHARACTERS --------
        char[] unique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // -------- FREQUENCY ARRAY (ASCII 256) --------
        int[] freq = new int[256];
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // -------- CREATE FINAL 2D ARRAY (char + freq) --------
        String[][] result = new String[uniqueCount][2];
        for (int i = 0; i < uniqueCount; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        // -------- DISPLAY --------
        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        sc.close();
    }
}
