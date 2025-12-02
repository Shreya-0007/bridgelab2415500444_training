import java.util.Scanner;
public class Q8_YoungestTallestFriends {
    public static int indexOfMin(int[] arr){
        int idx=0;
        for (int i=1;i<arr.length;i++) if (arr[i]<arr[idx]) idx=i;
        return idx;
    }
    public static int indexOfMax(int[] arr){
        int idx=0;
        for (int i=1;i<arr.length;i++) if (arr[i]>arr[idx]) idx=i;
        return idx;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar","Akbar","Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i=0;i<3;i++){
            System.out.print("Enter age of "+names[i]+": ");
            ages[i]=sc.nextInt();
            System.out.print("Enter height (cm) of "+names[i]+": ");
            heights[i]=sc.nextDouble();
        }
        System.out.println("Youngest: "+names[indexOfMin(ages)]);
        System.out.println("Tallest: "+names[indexOfMax(new int[]{(int)heights[0],(int)heights[1],(int)heights[2]})]);
        sc.close();
    }
}
