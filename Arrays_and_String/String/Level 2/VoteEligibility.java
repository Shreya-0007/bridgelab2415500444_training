import java.util.Scanner;

class VotingEligibility_NoFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------- INPUT: Ages of 10 students --------
        int n = 10;
        int[] ages = new int[n];

        System.out.println("Enter ages of " + n + " students:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        // -------- CREATE 2D ARRAY [Age, CanVote] --------
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            int age = ages[i];
            String status;

            if (age < 0) {
                status = "False (Invalid)";
            } else if (age >= 18) {
                status = "True";
            } else {
                status = "False";
            }

            result[i][0] = String.valueOf(age);
            result[i][1] = status;
        }

        // -------- DISPLAY TABULAR FORMAT --------
        System.out.println("\nStudent\tAge\tCan Vote?");
        System.out.println("-----------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + result[i][0] + "\t" + result[i][1]);
        }

        sc.close();
    }
}
