package homework1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /**
         * Task 10
         * Please enter a natural number from the keyboard in the range [0-24].
         * Based on the number entered, print a message that welcomes you. Business logic should be based on the following intervals:
         * 	5-10 – Good morning
         * 	11-18 – Good day
         * 	19-23 – Good evening
         * 	24-5 – Why aren't you sleeping?
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours [0 - 24]");
        int hours = sc.nextInt();

        if (hours < 0 || hours > 24) {
            System.err.println("Wrong number [0-24]");
        } else {
            if (hours >= 5 && hours <= 10) {
                System.out.println("Good morning");
            } else if (hours >= 11 && hours <= 18) {
                System.out.println("Good day");
            } else if (hours >= 19 && hours <= 23) {
                System.out.println("Good evening");
            } else { // 0-5 & 24
                System.out.println("Why aren't you sleeping?");
            }
        }
    }
}
