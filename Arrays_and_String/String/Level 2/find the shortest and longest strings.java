import java.util.Scanner;

class ShortestLongestWord_NoFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- INPUT ----------------
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // ---------------- FIND LENGTH OF STRING ----------------
        int length = 0;
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // end of string
        }

        // ---------------- SPLIT INTO WORDS ----------------
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];
        int start = 0;
        int wordIdx = 0;

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == ' ') {
                StringBuilder sb = new StringBuilder();
                for (int j = start; j < i; j++) {
                    sb.append(input.charAt(j));
                }
                words[wordIdx++] = sb.toString();
                start = i + 1;
            }
        }

        // Last word
        StringBuilder sb = new StringBuilder();
        for (int j = start; j < length; j++) {
            sb.append(input.charAt(j));
        }
        words[wordIdx] = sb.toString();

        // ---------------- CREATE 2D ARRAY (WORD + LENGTH) ----------------
        String[][] table = new String[wordCount][2];
        for (int i = 0; i < wordCount; i++) {
            int wordLen = 0;
            try {
                while (true) {
                    words[i].charAt(wordLen);
                    wordLen++;
                }
            } catch (Exception e) {
                // end of word
            }
            table[i][0] = words[i];
            table[i][1] = String.valueOf(wordLen);
        }

        // ---------------- FIND SHORTEST & LONGEST ----------------
        String shortest = table[0][0];
        int minLen = Integer.parseInt(table[0][1]);

        String longest = table[0][0];
        int maxLen = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < minLen) {
                minLen = len;
                shortest = table[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = table[i][0];
            }
        }

        // ---------------- DISPLAY ----------------
        System.out.println("\nWord\tLength");
        System.out.println("------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        System.out.println("\nShortest Word: " + shortest + " (Length " + minLen + ")");
        System.out.println("Longest Word: " + longest + " (Length " + maxLen + ")");

        sc.close();
    }
}
