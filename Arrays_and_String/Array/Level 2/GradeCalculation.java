import java.util.*;
 class Grades{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Enter the number of students");
        n = sc.nextInt();
        char grades[] = new char[n];
        double per[] = new double[n];
        double maths[] = new double[n];
        double chem[] = new double[n];
        double phy[] = new double[n];
        for ( i = 0; i < n; i++) {
            System.out.println("Enter the marks of physics");
            phy[i] = sc.nextDouble();
            if(phy[i]<0){
                System.out.println("Invalid marks entered ! Enter again");
                i--;
            }
            System.out.println("Enter the marks of chemistry");
            chem[i] = sc.nextDouble();
            if(chem[i]<0){
                System.out.println("Invalid marks entered ! Enter again");
                i--;
            }
            System.out.println("Enter the marks of maths");
            maths[i] = sc.nextDouble();
            if(maths[i]<0){
                System.out.println("Invalid marks entered ! Enter again");
                i--;
            }
        }
        for ( i = 0; i < n; i++) {
            per[i] = (phy[i]+chem[i]+maths[i])/3;
        }
        for (i = 0; i < n; i++) {
            if(per[i]>=80.0){
                grades[i] = 'A';
            }
            else if(per[i]>70.0 && per[i]<=79.0){
                grades[i] = 'B';
            }
            else if(per[i]>=60.0 && per[i]<=60.0){
                grades[i] = 'C';
            }
            else if(per[i]>=50.0 && per[i]<=59.0){
                grades[i] = 'D';
            }
            else if(per[i]>=40.0 && per[i]<=49.0){
                grades[i] = 'E';
            }
            else if(per[i]<=39.0){
                grades[i] = 'R';
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println("Marks of physics "+phy[i]);
            System.out.println("Marks of chemistry "+chem[i]);
            System.out.println("Marks of maths "+maths[i]);
           System.out.println("Grade is "+grades[i]);
           System.out.println("Percentage is "+per[i]);
        }
        System.out.println();
    }
}

