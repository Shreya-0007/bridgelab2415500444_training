import java.util.*;
class Bonus{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i ,size = 10;
         double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        double salary[] = new double[size];
        double years[] = new double[size];
        double bonus[] = new double[size];
        double newSalary[] = new double[size];
        for(i=0 ; i<10 ; i++){
            System.out.println("Enter the current salary of the employees");
            double s = sc.nextDouble();
            if(s<=0){
                System.out.println("Invalid Salary! Enter again ");
                i--;
                continue;
            }
            System.out.println("Enter the years of service of the employees");
            double y =sc.nextDouble();
            if(y<0){
                System.out.println("Invalid years entered ! Enter again");
                i--;
                continue;
            }
            years[i] = y;
            salary[i] = s;
        }
          for (i = 0; i < size; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
             System.out.println("\n--- Employee Bonus Report ---");
        for (i = 0; i < size; i++) {
            System.out.println("Employee " + (i + 1) +
                               " | Old Salary = " + salary[i] +
                               " | Bonus = " + bonus[i] +
                               " | New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary of all employees = " + totalOldSalary);
        System.out.println("Total Bonus payout = " + totalBonus);
        System.out.println("Total New Salary of all employees = " + totalNewSalary);
    }
}
