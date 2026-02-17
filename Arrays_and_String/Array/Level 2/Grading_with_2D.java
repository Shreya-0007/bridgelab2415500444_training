import java.util.*;

class StudentMarks2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Step 2: Create 2D array for marks [students][3 subjects]
        double[][] marks = new double[n][3];
        double[] per = new double[n];
        char[] grades = new char[n];

        // Step 3: Take input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");
            for (int j = 0; j < 3; j++) {
                double input = sc.nextDouble();
                if (input < 0) {   // check for negative
                    System.out.println("Invalid! Marks cannot be negative. Enter again:");
                    j--; // repeat this subject input
                } else {
                    marks[i][j] = input;
                }
            }
        }

        // Step 4: Calculate percentage
        for (int i = 0; i < n; i++) {
            per[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
        }

        // Step 5: Assign grades
        for (int i = 0; i < n; i++) {
            if (per[i] >= 80.0) {
                grades[i] = 'A';
            } else if (per[i] >= 70.0) {
                grades[i] = 'B';
            } else if (per[i] >= 60.0) {
                grades[i] = 'C';
            } else if (per[i] >= 50.0) {
                grades[i] = 'D';
            } else if (per[i] >= 40.0) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Step 6: Display results in a clean format
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + per[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
    }
}
