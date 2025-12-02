import java.util.Scanner;
public class Q2_SumNaturalNumbersRecursion {
    public static long sumRec(int n) {
        if (n <= 0) return 0;
        return n + sumRec(n-1);
    }
    public static long sumFormula(int n) {
        return (long)n * (n+1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter natural number n: ");
        int n = sc.nextInt();
        long r = sumRec(n);
        long f = sumFormula(n);
        System.out.println("Sum using recursion = "+r);
        System.out.println("Sum using formula = "+f);
        System.out.println("Equal? "+(r==f));
        sc.close();
    }
}
