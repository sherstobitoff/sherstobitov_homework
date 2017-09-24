// Created by Sherstobitov Maxim on 22.09.2017
import java.util.Scanner;
public class NextDay {
    public static void main(String[] args) {
        int day = scanVariable("Введите день:");
        int month = scanVariable("Введите месяц:");
        int year = scanVariable("Введите год:");

        if (day > amountOfDaysInMonth(month, year) || (day < 1) || (month > 12) || (month < 1) || (year <0)) {
            System.out.println("Неверный формат даты");
            return;
        }

        int newDay = day + 1 > amountOfDaysInMonth(month, year) ? 1 : day + 1;

        int newMonth;
        if (newDay == 1) {
            if (month == 12) {
                newMonth = 1;
            } else {
                newMonth = month + 1;
            }
        } else {
            newMonth = month;
        }

        int newYear = (newMonth == 1 && newDay == 1) ? year + 1 : year;

        System.out.println("==============\nСледующий день: " + formatDate(newDay, newMonth, newYear));
    }


    public static int amountOfDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) {
                return 28;
            } else {
                return 29;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    public static String formatDate(int day, int month, int year) {
        String makeNiceDayInDate = day <= 9 ? "0" : "";
        String makeNiceMonthInDate = month <= 9 ? "0" : "";
        return makeNiceDayInDate + day + "." + makeNiceMonthInDate + month + "." + year;
    }
    public static int scanVariable (String variableDescription) {
        System.out.println(variableDescription);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}


