import java.util.*;
class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Error");
        } else {
            int size = n / 2 + 1;
            int a[] = new int[size]; // even array
            int b[] = new int[size]; // odd array
            int evenidx = 0, oddidx = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    a[evenidx] = i;
                    evenidx++;
                } else {
                    b[oddidx] = i;
                    oddidx++;
                }
            }

            System.out.print("Even array is: ");
            for (int i = 0; i < evenidx; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.print("\nOdd array is: ");
            for (int i = 0; i < oddidx; i++) {
                System.out.print(b[i] + " ");
            }

            System.out.println(); // final line break
        }
    }
}

 
    
