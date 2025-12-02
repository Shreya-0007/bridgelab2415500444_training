import java.util.Scanner;
public class Q9_PositiveNegativeEvenOdd {
    public static boolean isPositive(int x){ return x>0; }
    public static boolean isEven(int x){ return x%2==0; }
    public static int compare(int a,int b){ return a>b?1:(a==b?0:-1); }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i=0;i<5;i++) arr[i]=sc.nextInt();
        for (int v:arr){
            if (!isPositive(v)) System.out.println(v+" is negative");
            else System.out.println(v+" is positive and "+(isEven(v)?"even":"odd"));
        }
        int comp = compare(arr[0], arr[4]);
        System.out.println("Comparison of first and last element: " + (comp==1?"first>last":(comp==0?"equal":"first<last")));
        sc.close();
    }
}
