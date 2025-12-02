import java.util.Scanner;
public class Q9_CalendarDisplay {
    private static String[] months = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
    private static int[] mdaysNonLeap = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static boolean isLeap(int y){ return (y%4==0 && y%100!=0) || (y%400==0); }
    public static int daysInMonth(int m,int y){ if (m==2) return mdaysNonLeap[m] + (isLeap(y)?1:0); return mdaysNonLeap[m]; }
    // Zeller's Congruence to get day of week: 0=Sunday..6=Saturday for Gregorian calendar
    public static int firstDayOfMonth(int m,int y){
        int q=1;
        int mm = m;
        int yy = y;
        if (m < 3) { mm = m + 12; yy = y - 1; }
        int K = yy % 100;
        int J = yy / 100;
        int h = (q + (13*(mm+1))/5 + K + K/4 + J/4 + 5*J) % 7;
        int d = ((h + 6) % 7); // convert to 0=Sunday
        return d;
    }
    public static void displayCalendar(int m,int y){
        System.out.println("    " + months[m] + " " + y);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int first = firstDayOfMonth(m,y);
        int dim = daysInMonth(m,y);
        for (int i=0;i<first;i++) System.out.print("   ");
        for (int d=1; d<=dim; d++){
            System.out.printf("%2d ", d);
            if ((first + d) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12) and year: ");
        int m = sc.nextInt(), y = sc.nextInt();
        displayCalendar(m,y);
        sc.close();
    }
}
