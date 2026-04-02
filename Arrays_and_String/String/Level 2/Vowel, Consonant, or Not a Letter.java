import java.util.Scanner;

class VowelConsonantType_NoFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- INPUT ----------------
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // ---------------- FIND LENGTH ----------------
        int length = 0;
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // reached end of string
        }

        // ---------------- CREATE 2D ARRAY ----------------
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            char original = ch;

            // Convert uppercase to lowercase (ASCII logic)
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            String type;
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    type = "Vowel";
                } else {
                    type = "Consonant";
                }
            } else {
                type = "Not a Letter";
            }

            result[i][0] = String.valueOf(original);
            result[i][1] = type;
        }

        // ---------------- DISPLAY TABULAR OUTPUT ----------------
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        sc.close();
    }
}
