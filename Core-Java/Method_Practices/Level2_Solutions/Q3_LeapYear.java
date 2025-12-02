import java.util.Scanner;
public class Q3_LeapYear {
    public static boolean isLeap(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        System.out.println(y + (isLeap(y) ? " is a Leap Year" : " is not a Leap Year"));
        sc.close();
    }
}
