import java.util.*;

class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Step 1: Take input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.println("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        // Step 2: Find youngest
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }

        // Step 3: Find tallest
        int maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }

        // Step 4: Display results
        System.out.println("\nThe youngest friend is: " + youngest + " (Age: " + minAge + ")");
        System.out.println("The tallest friend is: " + tallest + " (Height: " + maxHeight + " cm)");
    }
}
