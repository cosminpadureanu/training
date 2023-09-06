package homework1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /**
         * Task 11
         * Please enter a three-digit natural number.
         * Perform a check between each of the three digits of this number and based on the check display a message:
         * 	The numbers are equal.
         * 	Ascending order.
         * 	Descending order.
         * 	Try with another number.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a three-digit natural number.");
        int userNumber = sc.nextInt();

        if (userNumber >= 100 && userNumber <= 999) {
            int a = userNumber / 100;
            int b = (userNumber / 10 ) % 10;
            int c = userNumber % 10;

            if (a == b && b == c) {
                System.out.println("The numbers are equal.");
            } else if (a > b && b > c) {
                System.out.println("Descending order.");
            } else if (a < b && b < c) {
                System.out.println("Ascending order.");
            } else {
                System.out.println("Try with another number.");
            }
        } else {
            System.err.println("Please enter a three-digit natural number.");
        }
    }
}
