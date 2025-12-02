import java.util.Random;
public class Q13_StudentMarksReport {
    public static int[][] generatePCM(int students){
        Random r = new Random();
        int[][] a = new int[students][3];
        for (int i=0;i<students;i++){
            a[i][0] = 10 + r.nextInt(90);
            a[i][1] = 10 + r.nextInt(90);
            a[i][2] = 10 + r.nextInt(90);
        }
        return a;
    }
    public static double[][] totalsAveragesPercent(int[][] pcm){
        int n = pcm.length;
        double[][] out = new double[n][3]; // total, average, percentage
        for (int i=0;i<n;i++){
            int tot = pcm[i][0]+pcm[i][1]+pcm[i][2];
            double avg = tot/3.0;
            double perc = (tot / 300.0) * 100.0;
            out[i][0]=tot; out[i][1]=Math.round(avg*100.0)/100.0; out[i][2]=Math.round(perc*100.0)/100.0;
        }
        return out;
    }
    public static void main(String[] args){
        int[][] pcm = generatePCM(5);
        double[][] rep = totalsAveragesPercent(pcm);
        System.out.println("P\tC\tM\tTotal\tAvg\t%");
        for (int i=0;i<pcm.length;i++){
            System.out.printf("%d\t%d\t%d\t%.0f\t%.2f\t%.2f%n", pcm[i][0],pcm[i][1],pcm[i][2], rep[i][0], rep[i][1], rep[i][2]);
        }
    }
}
