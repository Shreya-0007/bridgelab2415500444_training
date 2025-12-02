import java.util.ArrayList;
import java.util.Scanner;
public class Q1_Factors {
    public static int[] factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++) if (n % i == 0) list.add(i);
        int[] arr = new int[list.size()];
        for (int i=0;i<list.size();i++) arr[i]=list.get(i);
        return arr;
    }
    public static int sumArray(int[] arr) {
        int s=0; for (int v:arr) s+=v; return s;
    }
    public static long productArray(int[] arr) {
        long p=1; for (int v:arr) p*=v; return p;
    }
    public static long sumSquare(int[] arr) {
        long s=0; for (int v:arr) s+= (long)v*v; return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int[] f = factors(n);
        System.out.print("Factors: ");
        for (int v:f) System.out.print(v+" ");
        System.out.println();
        System.out.println("Sum = "+sumArray(f));
        System.out.println("Sum of squares = "+sumSquare(f));
        System.out.println("Product = "+productArray(f));
        sc.close();
    }
}
