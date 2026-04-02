import java.util.*;
   class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        for (i=0;i<n;i++){
            System.out.println("Enter the element in array");
            a[i]= sc.nextInt();
        }
         i=0;
        int j=n-1;
        while(i<j){
            int temp = a[0];
            a[0] = a[j];
            a[i]=temp;
            i++;
            j--;
        }
        for(i=0;i<n;i++){
       System.out.println(a[i]) ;
    }
}
}
