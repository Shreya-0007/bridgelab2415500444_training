import java.util.ArrayList;
public class Q7_FactorsArrayTasks {
    public static int[] factors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++) if (n%i==0) list.add(i);
        int[] a = new int[list.size()]; for (int i=0;i<a.length;i++) a[i]=list.get(i); return a;
    }
    public static int greatestFactor(int[] a){ int g=0; for (int v:a) if (v>g && v!=a[a.length-1]) g=v; return g; }
    public static int sum(int[] a){ int s=0; for (int v:a) s+=v; return s; }
    public static long product(int[] a){ long p=1; for (int v:a) p*=v; return p; }
    public static long productOfCubes(int[] a){ long p=1; for (int v:a) p*= (long)Math.pow(v,3); return p; }
    public static void main(String[] args){
        int n = 12;
        int[] f = factors(n);
        System.out.print("Factors: "); for (int v:f) System.out.print(v+" "); System.out.println();
        System.out.println("Greatest factor (excluding n) = "+ (f.length>1?f[f.length-2]:0));
        System.out.println("Sum = "+sum(f));
        System.out.println("Product = "+product(f));
        System.out.println("Product of cubes = "+productOfCubes(f));
    }
}
