import java.util.Scanner;
public class Q2_MaxHandshakes {
    public static long maxHandshakes(int n) {
        return (long) n * (n - 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        System.out.println("Maximum possible handshakes: " + maxHandshakes(n));
        sc.close();
    }
}
