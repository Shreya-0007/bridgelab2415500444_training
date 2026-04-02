import java.util.*;

class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of persons: ");
        n = sc.nextInt();

        // 2D array: rows = persons, cols = [0]=height, [1]=weight, [2]=BMI
        double data[][] = new double[n][3];
        String status[] = new String[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the weight of person " + (i + 1) + " in kg: ");
            data[i][1] = sc.nextDouble();

            System.out.print("Enter the height of person " + (i + 1) + " in cm: ");
            data[i][0] = sc.nextDouble();

            // Convert cm → m
            double heightInMeters = data[i][0] / 100.0;

            // Calculate BMI
            data[i][2] = data[i][1] / (heightInMeters * heightInMeters);

            // Assign status
            if (data[i][2] <= 18.4) {
                status[i] = "Underweight";
            } else if (data[i][2] <= 24.9) {
                status[i] = "Normal";
            } else if (data[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Output in table format
        System.out.printf("%-8s %-12s %-12s %-10s %-15s%n",
                          "Person", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-8d %-12.1f %-12.1f %-10.2f %-15s%n",
                    (i + 1),
                    data[i][0], // height
                    data[i][1], // weight
                    data[i][2], // BMI
                    status[i]); // status
        }
    }
}
