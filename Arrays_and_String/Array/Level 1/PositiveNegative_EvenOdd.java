import java.util.*;
 class Positive_Even{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int a[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the number");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
           if(a[i] > 0){
            if(a[i] % 2 == 0){
                System.out.println("The number "+a[i]+" is even");
            }
            else{
                System.out.println("The number "+a[i]+" is odd");
            }
           }
        }
            if(a[0] == a[a.length - 1]){
                System.out.println("The numbers are equal");
            }
            else if(a[0] > a[a.length - 1]){
                System.out.println("The number "+a[0]+" is greater");
            }
            else if(a[0] < a[a.length - 1]){
                System.out.println("The number "+a[0]+" is less");
            }
           
           for (int i=0 ; i<a.length ;i++) {
            for(int j=1 ;j<=10;j++){
                int m=a[i]*j;
                System.out.println(a[i]+" X "+j+" = "+m);
           }   
           }
           System.out.println();
        }
    }
