import java.util.Scanner;
public class Q9_DistributeChocolates {
    public static int[] distribute(int chocolates, int children) {
        if (children <= 0) return new int[]{0, chocolates};
        int each = chocolates / children;
        int rem = chocolates % children;
        return new int[]{each, rem};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total chocolates: ");
        int choc = sc.nextInt();
        System.out.print("Number of children: ");
        int kids = sc.nextInt();
        int[] res = distribute(choc, kids);
        System.out.println("Each child gets: " + res[0] + ", Remaining chocolates: " + res[1]);
        sc.close();
    }
}
