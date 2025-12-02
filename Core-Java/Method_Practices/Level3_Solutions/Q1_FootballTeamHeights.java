import java.util.Random;
public class Q1_FootballTeamHeights {
    public static int[] generateHeights(int size){
        Random r = new Random();
        int[] h = new int[size];
        for (int i=0;i<size;i++) h[i] = 150 + r.nextInt(101); // 150-250
        return h;
    }
    public static int sum(int[] a){ int s=0; for (int v:a) s+=v; return s; }
    public static double mean(int[] a){ return sum(a)*1.0/a.length; }
    public static int min(int[] a){ int m=a[0]; for(int v:a) if (v<m) m=v; return m; }
    public static int max(int[] a){ int m=a[0]; for(int v:a) if (v>m) m=v; return m; }
    public static void main(String[] args){
        int[] heights = generateHeights(11);
        System.out.print("Heights: ");
        for (int v:heights) System.out.print(v+" ");
        System.out.println();
        System.out.println("Sum = "+sum(heights));
        System.out.println("Mean = "+String.format("%.2f", mean(heights)));
        System.out.println("Shortest = "+min(heights));
        System.out.println("Tallest = "+max(heights));
    }
}
