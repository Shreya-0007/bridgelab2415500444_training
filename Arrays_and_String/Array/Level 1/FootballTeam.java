import java.util.*;
 class Football{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 11;
        double height[] = new double[size];
        for (int i = 0; i < height.length; i++) {
            System.out.println("Enter the student's height");
            height[i] = sc.nextDouble();
        } double sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum = sum + height[i];
        }
        double mean_height = sum / 11;
        System.out.println("The mean height is "+mean_height); 
    }
}
    
    