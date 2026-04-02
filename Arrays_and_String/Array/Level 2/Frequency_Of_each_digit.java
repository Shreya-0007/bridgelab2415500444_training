import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,f=0;
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        int freq[] = new int[10];
        for(i=0;i<n;i++){
            System.out.println("Enter the element in array");
            a[i]= sc.nextInt();
        }
        for(i=0;i<n;i++){
            freq[a[i]]++ ;
            }
        for(i=0;i<freq.length;i++){   
        System.out.println("Frequency of " +i+" is : "+freq[i]);
        }
}
}
