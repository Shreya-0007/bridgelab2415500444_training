import java.util.Scanner;

class TheLengthWihtoutLength{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter a string:");
        String input = sc.next();   // next() will read one word only

        int count = 0;

        // Logic without using length()
        try {
            while (true) {
                input.charAt(count);   // keep checking characters
                count++;
            }
        } catch (Exception e) {
            // when exception occurs, loop ends
        }

        // Using built-in length()
        int builtInLength = input.length();

        // Display results
        System.out.println("Length without using length(): " + count);
        System.out.println("Length using length(): " + builtInLength);

        sc.close();
    }
}
