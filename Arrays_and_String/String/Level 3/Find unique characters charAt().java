import java.util.Scanner;

class UniqueCharacters_NoFunc {
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

        // -------- FIND UNIQUE CHARACTERS --------
        char[] unique = new char[length]; // temporary store
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // check if already appeared
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

        // -------- STORE UNIQUE CHARACTERS IN FINAL ARRAY --------
        char[] finalUnique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalUnique[i] = unique[i];
        }

        // -------- DISPLAY RESULT --------
        System.out.println("\nUnique characters in the string:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(finalUnique[i] + " ");
        }

        sc.close();
    }
}
