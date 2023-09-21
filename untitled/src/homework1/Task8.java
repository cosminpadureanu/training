package homework;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /**
         * Task 8
         * Please enter a three-digit number from the keyboard, without the digit 0 in this number.
         * Check if the entered number is divisible by each of its digits.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 digit number [111 - 999] without the digit 0");

        int number = sc.nextInt();
        if (number < 111 || number > 999) {
            System.err.println("Wrong number, must be between [111 - 999]");
        } else {
            int firstDigit = number / 100;
            System.out.println(firstDigit);
            int secondNumber = (number / 10) % 10;
            System.out.println(secondNumber);
            int thirdDigit = number % 10;
            System.out.println(thirdDigit);

            // if (firstDigit == 0 || secondNumber == 0 || thirdDigit == 0) {
            if (secondNumber == 0 || thirdDigit == 0) {
                System.err.println("Please don't use ZERO!");
            } else {
                if ((number % firstDigit == 0) && (number % secondNumber == 0) && (number % thirdDigit == 0)) {
                    System.out.println( "The number is divisible by each of its digits.");
                } else {
                    System.out.println("The number is NOT divisible by each of its digits.");
                }
            }
        }
    }
}
