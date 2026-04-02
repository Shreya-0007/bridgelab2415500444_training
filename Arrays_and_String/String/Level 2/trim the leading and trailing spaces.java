import java.util.Scanner;

 class TrimString_NoFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ----------- INPUT -----------
        System.out.println("Enter a string with leading and trailing spaces:");
        String text = sc.nextLine();

        // ----------- FIND LENGTH -----------
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // end of string reached
        }

        // ----------- FIND START (skip leading spaces) -----------
        int start = 0;
        while (start < length) {
            if (text.charAt(start) != ' ') break;
            start++;
        }

        // ----------- FIND END (skip trailing spaces) -----------
        int end = length - 1;
        while (end >= 0) {
            if (text.charAt(end) != ' ') break;
            end--;
        }

        // ----------- CREATE SUBSTRING USING CHARAT() -----------
        String trimmedCustom = "";
        for (int i = start; i <= end; i++) {
            trimmedCustom = trimmedCustom + text.charAt(i);
        }

        // ----------- BUILT-IN TRIM -----------
        String trimmedBuiltin = text.trim();

        // ----------- COMPARE CHARACTERS ONE BY ONE -----------
        boolean isSame = true;
        int len1 = 0, len2 = 0;

        try {
            while (true) { trimmedCustom.charAt(len1); len1++; }
        } catch (Exception e) {}
        try {
            while (true) { trimmedBuiltin.charAt(len2); len2++; }
        } catch (Exception e) {}

        if (len1 != len2) {
            isSame = false;
        } else {
            for (int i = 0; i < len1; i++) {
                if (trimmedCustom.charAt(i) != trimmedBuiltin.charAt(i)) {
                    isSame = false;
                    break;
                }
            }
        }

        // ----------- DISPLAY RESULTS -----------
        System.out.println("\nOriginal String: [" + text + "]");
        System.out.println("Custom Trimmed : [" + trimmedCustom + "]");
        System.out.println("Built-in Trim  : [" + trimmedBuiltin + "]");
        System.out.println("Both Same?     : " + isSame);

        sc.close();
    }
}
