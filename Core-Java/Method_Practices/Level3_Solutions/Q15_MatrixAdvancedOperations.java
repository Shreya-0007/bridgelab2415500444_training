import java.util.Random;
public class Q15_MatrixAdvancedOperations {
    public static double[][] transpose(double[][] a){
        int r=a.length, c=a[0].length;
        double[][] t = new double[c][r];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) t[j][i]=a[i][j];
        return t;
    }
    public static double det2x2(double[][] m){
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }
    public static double det3x3(double[][] m){
        double det = m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                   - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                   + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
        return det;
    }
    public static double[][] inverse2x2(double[][] m){
        double d = det2x2(m);
        if (Math.abs(d) < 1e-9) return new double[][]{};
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1]/d; inv[0][1] = -m[0][1]/d;
        inv[1][0] = -m[1][0]/d; inv[1][1] = m[0][0]/d;
        return inv;
    }
    public static void printMatrix(double[][] m){
        for (int i=0;i<m.length;i++){ for (int j=0;j<m[0].length;j++) System.out.printf("%.2f ", m[i][j]); System.out.println(); }
    }
    public static void main(String[] args){
        double[][] a2 = {{4,7},{2,6}};
        System.out.println("Det 2x2: "+det2x2(a2));
        System.out.println("Inverse 2x2:"); printMatrix(inverse2x2(a2));
        double[][] a3 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Det 3x3: "+det3x3(a3));
    }
}
