import java.util.Scanner;
public class Q8_QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend and divisor: ");
        int n = sc.nextInt(), d = sc.nextInt();
        int[] qr = findRemainderAndQuotient(n,d);
        System.out.println("Quotient = " + qr[0] + ", Remainder = " + qr[1]);
        sc.close();
    }
}
