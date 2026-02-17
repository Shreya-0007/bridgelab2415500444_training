import java.util.*;
class CopyArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n,i,j,size,count=0;
        System.out.println("Enter the size of row");
        m = sc.nextInt();
        System.out.println("Enter the size of the column");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        size = m*n;
        int b[] = new int[size];
        for(i=0; i<m ; i++){
            for(j=0; j<n; j++){
                System.out.println("Enter the elements in 2-D array");
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for(j=0 ; j<n ;j++)
            {
                b[count] = a[i][j];
                count++;
            }
        }
        for(i=0 ;i<count ;i++){
            System.out.print(b[i]+",");
        }
        System.out.println();
    }
}