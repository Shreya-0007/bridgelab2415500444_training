import java.util.*;
 class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int size = 4;
        int a[] = new int[size];
        for (int i = 6; i <= 9; i++) {
            a[i] =n*i;
            System.out.println(n+" X "+i+" = "+a[i]);
        }   
    }
}