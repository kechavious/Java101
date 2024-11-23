package Chapter05;

import java.util.Calendar;

public class CalendarUtility {

    // Method to print the calendar month
    public static void printCalendarMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1); // month is zero-based

        int numOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa");
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= numOfDaysInMonth; day++) {
            System.out.printf("%4d ", day);
            if ((firstDayOfWeek + day - 1) % 7 == 0 || day == numOfDaysInMonth) {
                System.out.println();
            }
        }
    }

    // Method to print the number of days in a month
    public static int getDaysInMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1); // month is zero-based

        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    // Method to print the number of days in a year
    public static int getDaysInYear(int year) {
        if (isLeapYear(year)) {
            return 366;
        } else {
            return 365;
        }
    }

    // Method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2024;
        int month = 2;

        // Print calendar month
        System.out.println("Calendar for " + year + ", " + month + ":");
        printCalendarMonth(year, month);

        // Print number of days in the given month
        System.out.println("Number of days in month " + month + ": " + getDaysInMonth(year, month));

        // Print number of days in the given year
        System.out.println("Number of days in year " + year + ": " + getDaysInYear(year));
    }
}
