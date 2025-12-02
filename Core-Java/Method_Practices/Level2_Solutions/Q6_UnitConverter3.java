public class Q6_UnitConverter3 {
    public static double fahrenheitToCelsius(double f){ return (f - 32) * 5.0 / 9.0; }
    public static double celsiusToFahrenheit(double c){ return (c * 9.0 / 5.0) + 32; }
    public static double poundsToKg(double p){ return p * 0.453592; }
    public static double kgToPounds(double kg){ return kg * 2.20462; }
    public static double gallonsToLiters(double g){ return g * 3.78541; }
    public static double litersToGallons(double l){ return l * 0.264172; }
    public static void main(String[] args){
        System.out.println("F->C example: 98.6F = " + fahrenheitToCelsius(98.6));
    }
}
