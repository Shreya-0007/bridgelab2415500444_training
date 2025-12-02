import java.util.Scanner;
public class Q3_TriangularPark {
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }
    public static int roundsForDistance(double perimeterMeters, double targetMeters) {
        return (int) Math.ceil(targetMeters / perimeterMeters);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side a (m): "); double a = sc.nextDouble();
        System.out.print("Side b (m): "); double b = sc.nextDouble();
        System.out.print("Side c (m): "); double c = sc.nextDouble();
        double per = perimeter(a,b,c);
        int rounds = roundsForDistance(per, 5000);
        System.out.printf("Perimeter = %.2f m. Rounds needed to complete 5 km = %d%n", per, rounds);
        sc.close();
    }
}
