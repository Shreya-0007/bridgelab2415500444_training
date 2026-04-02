import java.util.Scanner;

class VowelConsonant_NoFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- INPUT ----------------
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        // ---------------- PROCESS EACH CHARACTER ----------------
        int length = 0;
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // end of string
        }

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);

            // Convert uppercase to lowercase using ASCII
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // difference between uppercase & lowercase
            }

            // Check if character is a-z
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // ---------------- DISPLAY ----------------
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + consonants);

        sc.close();
    }
}
