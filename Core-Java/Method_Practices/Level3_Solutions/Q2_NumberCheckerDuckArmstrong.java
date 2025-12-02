import java.util.ArrayList;
public class Q2_NumberCheckerDuckArmstrong {
    public static int countDigits(int n){ return String.valueOf(Math.abs(n)).length(); }
    public static int[] digitsArray(int n){
        n = Math.abs(n);
        ArrayList<Integer> list = new ArrayList<>();
        while (n>0){ list.add(0,n%10); n/=10; }
        int[] a = new int[list.size()];
        for (int i=0;i<a.length;i++) a[i]=list.get(i);
        return a;
    }
    public static boolean isDuck(int n){
        String s = String.valueOf(n);
        return s.contains("0") && s.charAt(0)!='0';
    }
    public static boolean isArmstrong(int n){
        int[] d = digitsArray(n);
        int p = d.length; int sum=0;
        for (int v:d) sum += Math.pow(v,p);
        return sum == n;
    }
    public static void main(String[] args){
        int n = 153;
        System.out.println("Digits of "+n+": "+countDigits(n));
        System.out.println(n+" is armstrong? "+isArmstrong(n));
        System.out.println("Duck(101)? "+isDuck(101));
    }
}
