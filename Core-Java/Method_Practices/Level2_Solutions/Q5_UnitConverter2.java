public class Q5_UnitConverter2 {
    public static double yardsToFeet(double y){ return y * 3.0; }
    public static double feetToYards(double f){ return f * 0.333333; }
    public static double metersToInches(double m){ return m * 39.3701; }
    public static double inchesToMeters(double i){ return i * 0.0254; }
    public static double inchesToCm(double i){ return i * 2.54; }
    public static void main(String[] args){
        System.out.println("yards->feet example: 5 yd = " + yardsToFeet(5));
    }
}
