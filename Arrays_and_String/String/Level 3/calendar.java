import java.util.Scanner;

class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------- INPUT --------
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // -------- MONTH NAMES --------
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};

        // -------- DAYS IN MONTH --------
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // -------- CHECK LEAP YEAR --------
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (month == 2 && isLeap) {
            daysInMonth[1] = 29;
        }

        int days = daysInMonth[month - 1];

        // -------- FIND FIRST DAY USING ZELLER'S CONGRUENCE --------
        int m = month;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        int firstDay = (1 + 13*(m+1)/5 + k + k/4 + j/4 + 5*j) % 7; // 0=Saturday, 1=Sunday...
        int startDay = (firstDay + 6) % 7; // Convert to 0=Sunday

        // -------- DISPLAY HEADER --------
        System.out.println("\n   " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // -------- PRINT CALENDAR --------
        // Initial spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    "); // 4 spaces per day
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        sc.close();
    }
}
