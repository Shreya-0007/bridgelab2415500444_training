import java.util.*;
 class MultiplicationTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int size = 10;
        int a[] = new int[size];
        for (int i = 0; i <= 10; i++) {
            a[i] =n*i;
            System.out.println(n+" X "+i+" = "+a[i]);
        }   
    }
}
 