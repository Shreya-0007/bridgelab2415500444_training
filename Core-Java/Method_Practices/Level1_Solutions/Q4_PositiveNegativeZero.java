import java.util.Scanner;
public class Q4_PositiveNegativeZero {
    // returns -1 for negative, 1 for positive, 0 for zero
    public static int signOfNumber(int x) {
        if (x < 0) return -1;
        if (x > 0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int x = sc.nextInt();
        int sign = signOfNumber(x);
        if (sign == -1) System.out.println("Negative number");
        else if (sign == 1) System.out.println("Positive number");
        else System.out.println("Zero");
        sc.close();
    }
}
