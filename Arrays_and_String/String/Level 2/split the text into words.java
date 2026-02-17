import java.util.Scanner;

 class SplitWithoutFunctions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input
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
            // stop when out of bounds
        }

        // ---------------- COUNT SPACES ----------------
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;

        // ---------------- STORE SPACE INDEXES ----------------
        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        // ---------------- EXTRACT WORDS ----------------
        String[] customWords = new String[wordCount];
        int start = 0;
        int wordIdx = 0;

        for (int i = 0; i < spaceCount; i++) {
            int end = spaceIndexes[i];
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) {
                sb.append(input.charAt(j));
            }
            customWords[wordIdx++] = sb.toString();
            start = end + 1;
        }

        // Last word
        StringBuilder sb = new StringBuilder();
        for (int j = start; j < length; j++) {
            sb.append(input.charAt(j));
        }
        customWords[wordIdx] = sb.toString();

        // ---------------- BUILT-IN SPLIT ----------------
        String[] builtInWords = input.split(" ");

        // ---------------- COMPARE ARRAYS ----------------
        boolean isEqual = true;
        if (customWords.length != builtInWords.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < customWords.length; i++) {
                if (!customWords[i].equals(builtInWords[i])) {
                    isEqual = false;
                    break;
                }
            }
        }

        // ---------------- DISPLAY RESULTS ----------------
        System.out.println("Custom Split Result:");
        for (String word : customWords) {
            System.out.println(word);
        }
    }
}

