import java.util.Scanner;

class AnagramCheckEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------- INPUT --------
        System.out.println("Enter first text:");
        String text1 = sc.nextLine();

        System.out.println("Enter second text:");
        String text2 = sc.nextLine();

        // -------- FIND LENGTHS --------
        int len1 = 0, len2 = 0;
        try { while(true) { text1.charAt(len1); len1++; } } catch(Exception e) {}
        try { while(true) { text2.charAt(len2); len2++; } } catch(Exception e) {}

        if (len1 != len2) {
            System.out.println("The texts are NOT anagrams (different lengths).");
            sc.close();
            return;
        }

        // -------- CONVERT TO CHAR ARRAY --------
        char[] arr1 = new char[len1];
        char[] arr2 = new char[len2];

        for (int i = 0; i < len1; i++) arr1[i] = text1.charAt(i);
        for (int i = 0; i < len2; i++) arr2[i] = text2.charAt(i);

        // -------- SORT ARRAYS (BUBBLE SORT) --------
        for (int i = 0; i < len1 - 1; i++) {
            for (int j = 0; j < len1 - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    char temp = arr1[j]; arr1[j] = arr1[j+1]; arr1[j+1] = temp;
                }
                if (arr2[j] > arr2[j + 1]) {
                    char temp = arr2[j]; arr2[j] = arr2[j+1]; arr2[j+1] = temp;
                }
            }
        }

        // -------- COMPARE ARRAYS --------
        boolean isAnagram = true;
        for (int i = 0; i < len1; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram = false;
                break;
            }
        }

        // -------- DISPLAY RESULT --------
        if (isAnagram) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are NOT anagrams.");
        }

        sc.close();
    }
}
