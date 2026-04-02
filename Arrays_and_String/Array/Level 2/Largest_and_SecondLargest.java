import java.util.*;

class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Define array with max size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 3: Extract digits
        while (number != 0) {
            int digit = number % 10;   // get last digit
            digits[index] = digit;     // store in array
            index++;
            number /= 10;              // remove last digit

            if (index == maxDigit) {
                break; // stop if array limit reached
            }
        }

        // Step 4: Find largest and second largest digit
        int largest = -1;
        int second = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        // Step 5: Display results
        System.out.println("Digits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit: " + largest);

        if (second == -1) {
            System.out.println("Second largest digit not found (all digits same).");
        } else {
            System.out.println("Second largest digit: " + second);
        }
    }
}

