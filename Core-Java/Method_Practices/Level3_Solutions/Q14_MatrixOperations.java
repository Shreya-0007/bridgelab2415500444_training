import java.util.Random;
public class Q14_MatrixOperations {
    public static int[][] randomMatrix(int r,int c){
        Random rnd = new Random();
        int[][] m = new int[r][c];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) m[i][j] = rnd.nextInt(10);
        return m;
    }
    public static int[][] add(int[][] a,int[][] b){
        int r=a.length, c=a[0].length;
        int[][] res = new int[r][c];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) res[i][j]=a[i][j]+b[i][j];
        return res;
    }
    public static int[][] subtract(int[][] a,int[][] b){
        int r=a.length, c=a[0].length;
        int[][] res = new int[r][c];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) res[i][j]=a[i][j]-b[i][j];
        return res;
    }
    public static int[][] multiply(int[][] a,int[][] b){
        int r=a.length, c=b[0].length, common=a[0].length;
        int[][] res = new int[r][c];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++){
            int s=0; for (int k=0;k<common;k++) s+=a[i][k]*b[k][j]; res[i][j]=s;
        }
        return res;
    }
    public static void printMatrix(int[][] m){
        for (int i=0;i<m.length;i++){ for (int j=0;j<m[0].length;j++) System.out.print(m[i][j]+" "); System.out.println(); }
    }
    public static void main(String[] args){
        int[][] a = randomMatrix(2,3);
        int[][] b = randomMatrix(2,3);
        System.out.println("A:"); printMatrix(a);
        System.out.println("B:"); printMatrix(b);
        System.out.println("A+B:"); printMatrix(add(a,b));
        System.out.println("A-B:"); printMatrix(subtract(a,b));
        int[][] x = randomMatrix(3,2);
        System.out.println("A*X:"); printMatrix(multiply(a,x));
    }
}
