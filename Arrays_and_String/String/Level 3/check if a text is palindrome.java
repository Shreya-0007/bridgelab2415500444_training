import java.util.Scanner;

class PalindromeCheck_NoFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------- INPUT --------
        System.out.println("Enter a text:");
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

        // -------- CHECK PALINDROME (Logic 1: start & end comparison) --------
        boolean isPalindrome = true;
        int start = 0, end = length - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // -------- DISPLAY RESULT --------
        if (isPalindrome) {
            System.out.println("The text \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is NOT a Palindrome.");
        }

        sc.close();
    }
}
