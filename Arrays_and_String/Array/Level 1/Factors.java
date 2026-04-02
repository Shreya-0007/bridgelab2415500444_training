import java.util.*;
class Factor{
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int a[] = new int[n];
        for (i = 1; i < a.length; i++){
            if(n%i == 0){
                a[i] = i;
            }
        }
        for(i=1;i<a.length/2;i++){
    System.out.println("The factors of number "+n+" is"+a[i]);
            
        }
    }
}