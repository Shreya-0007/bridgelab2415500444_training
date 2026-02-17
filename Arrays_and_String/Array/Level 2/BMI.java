import java.util.*;
class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Enter the number of persons");
        n = sc.nextInt();
        double height[] = new double[n];    
        double weight[] = new double[n];
        double BMI[] = new double[n];
        String status[] = new String[n];
        for(i=0 ;i<n ;i++){
            System.out.println("Enter the weight of the persons");
             weight[i] = sc.nextDouble();
            System.out.println("Enter the height of the persons in cm");
             height[i] = sc.nextDouble();    
        }
        for(i=0; i<n; i++){
            height[i] =height[i]/100;
         BMI[i] = weight[i]/( height[i]*height[i]);
        }
        for (i = 0; i < n; i++) {
         if(BMI[i]<=18.4){
            status[i] = "Underweight";
         }
          else if(BMI[i]>=18.5 && BMI[i]<=24.9){
                status[i] = "Normal";
         }   
         else if(BMI[i]>=25.0 && BMI[i]<=39.9){
            status[i] = "Overweight";
         }
         else if(BMI[i]>=40.0){
            status[i] = "Obese";
         }
        }
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------------");

        for (i = 0; i < n; i++) {
            System.out.printf("%-10.1f %-10.1f %-10.2f %-15s%n",
                    height[i]*100,
                    weight[i],
                    BMI[i],
                    status[i]);
        }
    }
}
