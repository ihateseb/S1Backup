/*
 *	Author: Sebastian Blunt
 *  Date: 9/29/24
 *	Collaborator(s): none
*/

import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number corresponding to the current day (0 for Sunday, 1 for Monday, etc.):");
        int day = sc.nextInt();
        String dayName = "";
        String alarmTime = "";

        if (day == 0) {
            dayName = "Sunday";
            alarmTime = "10:00 AM";
        } else if (day == 1) {
            dayName = "Monday";
            alarmTime = "7:00 AM";
        } else if (day == 2) {
            dayName = "Tuesday";
            alarmTime = "7:00 AM";
        } else if (day == 3) {
            dayName = "Wednesday";
            alarmTime = "7:00 AM";
        } else if (day == 4) {
            dayName = "Thursday";
            alarmTime = "7:00 AM";
        } else if (day == 5) {
            dayName = "Friday";
            alarmTime = "7:00 AM";
        } else if (day == 6) {
            dayName = "Saturday";
            alarmTime = "10:00 AM";
        } else {
            System.out.println("Invalid input. Please enter a number between 0 and 6.");
            return;
        }

        System.out.println("It's " + dayName + ". Set your alarm for " + alarmTime);
    }
}
