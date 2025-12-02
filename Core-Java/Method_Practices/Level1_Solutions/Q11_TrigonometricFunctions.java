import java.util.Scanner;
public class Q11_TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double rad = Math.toRadians(angleDegrees);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        return new double[]{sin, cos, tan};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Angle in degrees: ");
        double angle = sc.nextDouble();
        double[] vals = calculateTrigonometricFunctions(angle);
        System.out.printf("sin=%.6f, cos=%.6f, tan=%.6f%n", vals[0], vals[1], vals[2]);
        sc.close();
    }
}
