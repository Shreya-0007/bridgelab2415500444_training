import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Manual comparison using charAt()
        boolean same = true;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    same = false;
                    break;
                }
            }
        } else {
            same = false;
        }

        // Output
        System.out.println("Using charAt(): " + same);
        System.out.println("Using equals(): " + str1.equals(str2));

        sc.close();
    }
}
