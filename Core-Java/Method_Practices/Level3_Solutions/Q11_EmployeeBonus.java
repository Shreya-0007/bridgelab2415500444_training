import java.util.Random;
public class Q11_EmployeeBonus {
    public static double[][] generateEmployees(int n){
        Random r = new Random();
        double[][] arr = new double[n][2]; // salary, years
        for (int i=0;i<n;i++){
            arr[i][0] = 10000 + r.nextInt(90000); // 5-digit salary approx
            arr[i][1] = r.nextInt(11); // years 0-10
        }
        return arr;
    }
    public static double[][] calculateNewSalaryAndBonus(double[][] data){
        int n = data.length;
        double[][] out = new double[n][3]; // old, bonus, new
        for (int i=0;i<n;i++){
            double old = data[i][0];
            double years = data[i][1];
            double bonus = years > 5 ? old * 0.05 : old * 0.02;
            double neu = old + bonus;
            out[i][0]=old; out[i][1]=bonus; out[i][2]=neu;
        }
        return out;
    }
    public static void main(String[] args){
        int n = 10;
        double[][] emp = generateEmployees(n);
        double[][] res = calculateNewSalaryAndBonus(emp);
        double sumOld=0,sumNew=0,sumBonus=0;
        System.out.println("Old\tYears\tBonus\tNew");
        for (int i=0;i<n;i++){
            System.out.printf("%.0f\t%.0f\t%.2f\t%.2f%n", emp[i][0], emp[i][1], res[i][1], res[i][2]);
            sumOld += emp[i][0]; sumNew += res[i][2]; sumBonus += res[i][1];
        }
        System.out.println("Total Old = "+(int)sumOld+" Total New = "+(int)sumNew+" Total Bonus = "+(int)sumBonus);
    }
}
