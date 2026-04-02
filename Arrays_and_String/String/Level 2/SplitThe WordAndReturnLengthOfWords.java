import java.util.Scanner;

 class  WordsWithLength{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- INPUT ----------------
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // ---------------- FIND LENGTH WITHOUT length() ----------------
        int length = 0;
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // end of string
        }

        // ---------------- SPLIT INTO WORDS WITHOUT split() ----------------
        // Count spaces
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

        // ---------------- CREATE 2D ARRAY (word + length) ----------------
        String[][] table = new String[wordCount][2];
        for (int i = 0; i < wordCount; i++) {
            // find length of each word without using .length()
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
            table[i][1] = String.valueOf(wordLen); // store as String
        }

        // ---------------- DISPLAY TABULAR OUTPUT ----------------
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordCount; i++) {
            String word = table[i][0];
            int len = Integer.parseInt(table[i][1]); // convert back to int
            System.out.println(word + "\t" + len);
        }

        sc.close();
    }
}
