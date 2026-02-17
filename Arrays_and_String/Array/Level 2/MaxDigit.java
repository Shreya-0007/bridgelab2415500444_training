import java.util.*;

class FriendsDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxFriends = 3; // initial capacity
        String[] names = new String[maxFriends];
        int[] ages = new int[maxFriends];
        int[] heights = new int[maxFriends];

        int count = 0;

        // Step 1: Take input (dynamic, expand if full)
        while (true) {
            if (count == maxFriends) {
                // Expand arrays by +10
                maxFriends += 10;

                String[] newNames = new String[maxFriends];
                int[] newAges = new int[maxFriends];
                int[] newHeights = new int[maxFriends];

                for (int i = 0; i < count; i++) {
                    newNames[i] = names[i];
                    newAges[i] = ages[i];
                    newHeights[i] = heights[i];
                }

                names = newNames;
                ages = newAges;
                heights = newHeights;
            }

            System.out.print("Enter friend's name (or type 'stop' to finish): ");
            String name = sc.next();
            if (name.equalsIgnoreCase("stop")) {
                break; // stop taking input
            }

            names[count] = name;

            System.out.print("Enter age of " + name + ": ");
            ages[count] = sc.nextInt();

            System.out.print("Enter height (in cm) of " + name + ": ");
            heights[count] = sc.nextInt();

            count++;
        }

        if (count == 0) {
            System.out.println("No friends entered!");
            return;
        }

        // Step 2: Find youngest
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < count; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }

        // Step 3: Find tallest
        int maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < count; i++) {
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
