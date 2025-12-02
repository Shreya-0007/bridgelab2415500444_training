public class Q4_NumberCheckerPalindromeDuck {
    public static int[] digitsArray(int n){
        String s = String.valueOf(Math.abs(n));
        int[] a = new int[s.length()];
        for (int i=0;i<s.length();i++) a[i]=s.charAt(i)-'0';
        return a;
    }
    public static int[] reverseArray(int[] a){
        int[] r = new int[a.length];
        for (int i=0;i<a.length;i++) r[i]=a[a.length-1-i];
        return r;
    }
    public static boolean arraysEqual(int[] a,int[] b){
        if (a.length!=b.length) return false;
        for (int i=0;i<a.length;i++) if (a[i]!=b[i]) return false;
        return true;
    }
    public static boolean isPalindrome(int n){ return arraysEqual(digitsArray(n), reverseArray(digitsArray(n))); }
    public static boolean isDuck(int n){ String s = String.valueOf(n); return s.contains("0") && s.charAt(0)!='0'; }
    public static void main(String[] args){
        int n = 121;
        System.out.println(n+" is palindrome? "+isPalindrome(n));
        System.out.println("Duck check for 101? "+isDuck(101));
    }
}
