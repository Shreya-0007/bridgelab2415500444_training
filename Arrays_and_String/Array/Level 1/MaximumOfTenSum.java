import java.util.*;
 class MaximumOf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 0.0;
        int size = 10;
        int index = 0;
        double a[] = new double[size];
            while(true){
                System.out.println("Enter the number");
                double i =sc.nextDouble();
                if(i <= 0 || index ==10){
                    break;
                }
                a[index] = i;
                i++;
            }
            for(int j = 0; j< index ; j++){
                n += a[j];
            }
            for (int j = 0; j < index; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("\nTotal = " +n);
        }
        
    }

    