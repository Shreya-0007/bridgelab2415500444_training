import java.util.HashMap;
import java.util.Map;
public class Q3_NumberCheckerHarshadFrequency {
    public static int[] digitsArray(int n){
        n = Math.abs(n);
        if (n==0) return new int[]{0};
        String s = String.valueOf(n);
        int[] a = new int[s.length()];
        for (int i=0;i<s.length();i++) a[i]=s.charAt(i)-'0';
        return a;
    }
    public static int sumDigits(int n){
        int sum=0; for (int d:digitsArray(n)) sum+=d; return sum;
    }
    public static int sumSquares(int n){
        int s=0; for (int d:digitsArray(n)) s += d*d; return s;
    }
    public static boolean isHarshad(int n){ int sd = sumDigits(n); return sd!=0 && n % sd == 0; }
    public static int[][] frequency(int n){
        int[] d = digitsArray(n);
        int[] freq = new int[10];
        for (int v:d) freq[v]++;
        int count=0; for (int i=0;i<10;i++) if (freq[i]>0) count++;
        int[][] res = new int[count][2];
        int idx=0;
        for (int i=0;i<10;i++) if (freq[i]>0){ res[idx][0]=i; res[idx][1]=freq[i]; idx++; }
        return res;
    }
    public static void main(String[] args){
        int n = 1729;
        System.out.println("Sum digits: "+sumDigits(n));
        System.out.println("Sum squares: "+sumSquares(n));
        System.out.println("Is Harshad? "+isHarshad(n));
        int[][] f = frequency(n);
        System.out.println("Digit frequencies:");
        for (int[] r:f) System.out.println(r[0]+ " -> " + r[1]);
    }
}
