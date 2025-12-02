import java.util.Scanner;
public class Q10_BMI_Calculator {
    public static double computeBMI(double weightKg, double heightCm){
        double h = heightCm / 100.0;
        return weightKg / (h*h);
    }
    public static String status(double bmi){
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // weight, height, bmi
        for (int i=0;i<10;i++){
            System.out.printf("Enter weight(kg) and height(cm) for person %d: ", i+1);
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
            data[i][2]=Math.round(computeBMI(data[i][0], data[i][1])*100.0)/100.0;
        }
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int i=0;i<10;i++){
            System.out.printf("%.1f\t%.1f\t%.2f\t%s%n", data[i][0], data[i][1], data[i][2], status(data[i][2]));
        }
        sc.close();
    }
}
