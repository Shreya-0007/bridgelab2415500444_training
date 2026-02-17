import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string and indexes
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring manually using charAt()
        String manualSub = "";
        for (int i = start; i < end; i++) {
            manualSub += text.charAt(i);
        }

        // Built-in substring
        String builtInSub = text.substring(start, end);

        // Compare manually using charAt()
        boolean same = true;
        if (manualSub.length() == builtInSub.length()) {
            for (int i = 0; i < manualSub.length(); i++) {
                if (manualSub.charAt(i) != builtInSub.charAt(i)) {
                    same = false;
                    break;
                }
            }
        } else {
            same = false;
        }

        // Display results
        System.out.println("\nSubstring using charAt(): " + manualSub);
        System.out.println("Substring using substring(): " + builtInSub);
        System.out.println("Are both substrings equal? " + same);

        sc.close();
    }
}
