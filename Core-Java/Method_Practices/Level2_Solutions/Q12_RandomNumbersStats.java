import java.util.Random;
import java.util.Scanner;
public class Q12_RandomNumbersStats {
    public static int[] generate4DigitRandomArray(int size){
        Random rnd = new Random();
        int[] arr = new int[size];
        for (int i=0;i<size;i++) arr[i] = rnd.nextInt(9000) + 1000;
        return arr;
    }
    public static double[] findAverageMinMax(int[] nums){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum=0;
        for (int v:nums){ sum += v; if (v<min) min=v; if (v>max) max=v; }
        double avg = sum*1.0/nums.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args){
        int[] arr = generate4DigitRandomArray(5);
        double[] res = findAverageMinMax(arr);
        System.out.print("Numbers: ");
        for (int v:arr) System.out.print(v+" ");
        System.out.println();
        System.out.printf("Average=%.2f, Min=%d, Max=%d%n", res[0], (int)res[1], (int)res[2]);
    }
}
