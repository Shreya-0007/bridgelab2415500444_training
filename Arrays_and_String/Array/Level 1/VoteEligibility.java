import java.util.*;
 class Vote{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int age[] = new int[size];
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the student's age");
            age[i] = sc.nextInt();
        }
        for (int i = 0; i < age.length; i++) {
            if(age[i] < 18){
                System.out.println("The student with age "+age[i]+" can't vote");
            }
            else{
                System.out.println("The student with the age "+age[i]+" can vote");
            }
        }
    }
}
    
