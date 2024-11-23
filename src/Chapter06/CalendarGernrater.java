package Chapter06;

import java.util.Scanner;

public class CalendarGernrater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year
        System.out.print("Enter full year (e.g., 2012): ");
        int year = scanner.nextInt();

        // Input month
        System.out.print("Enter month as number between 1 and 12: ");
        int month = scanner.nextInt();

        // Display the calendar
        printCalendar(year, month);

        scanner.close();
    }

    public static void printCalendar(int year, int month) {
        // Display the month and year
        System.out.println("        " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Get the first day of the month
        int startDay = getStartDay(year, month);

        // Get the number of days in the month
        int numDays = getNumDaysInMonth(year, month);

        // Print leading spaces before the first day of the month
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int i = 1; i <= numDays; i++) {
            System.out.printf("%3d ", i);
            if ((i + startDay) % 7 == 0 || i == numDays) {
                System.out.println();
            }
        }
    }

    // Get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month];
    }

    // Get the first day of the month
    public static int getStartDay(int year, int month) {
        final int BASE_YEAR = 1900;
        int totalDays = getTotalDays(year, month);
        return (totalDays + 1) % 7; // January 1, 1900 was a Monday (0)
    }

    // Get the total number of days since 1900 for the given month and year
    public static int getTotalDays(int year, int month) {
        final int BASE_YEAR = 1900;
        int totalDays = 0;

        // Calculate total days for years
        for (int i = BASE_YEAR; i < year; i++) {
            totalDays += isLeapYear(i) ? 366 : 365;
        }

        // Calculate total days for months
        for (int i = 1; i < month; i++) {
            totalDays += getNumDaysInMonth(year, i);
        }

        return totalDays;
    }

    // Get the number of days in the month
    public static int getNumDaysInMonth(int year, int month) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 31;
        }
    }

    // Check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
