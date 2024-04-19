package week1.time_units;

import java.util.Scanner;

public class TimeUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number of seconds: ");
        long totalSeconds = scanner.nextLong();

        long secondsInYear = 365 * 24 * 60 * 60;
        long years = totalSeconds / secondsInYear;
        long remainingSecondsAfterYears = totalSeconds % secondsInYear;

        long secondsInDay = 24 * 60 * 60;
        long days = remainingSecondsAfterYears / secondsInDay;
        long remainingSecondsAfterDays = remainingSecondsAfterYears % secondsInDay;

        long secondsInHour = 60 * 60;
        long hours = remainingSecondsAfterDays / secondsInHour;
        long remainingSecondsAfterHours = remainingSecondsAfterDays % secondsInHour;

        long secondsInMinute = 60;
        long minutes = remainingSecondsAfterHours / secondsInMinute;
        long seconds = remainingSecondsAfterHours % secondsInMinute;

        System.out.println(years + " years and " + days + " days and " + hours + " hours and " + minutes + " minutes and " + seconds + " seconds");
    }
}
