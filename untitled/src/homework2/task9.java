package homework2;

import java.util.Scanner;

/*
        Write a program that should do the following:
        To read a natural numbers entered by the user.
        When number 0 is entered, the program should stop reading more numbers
        from the console.
        To output the smallest and largest number of all entered numbers
*/
public class task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = 999999999;
        int max = 0;
        boolean shouldContinue = true;
        System.out.println("Please type numbers and press enter. Once your press zero min and Max are shown ");

        while (shouldContinue) {
            System.out.println("Please type a  numbers and press enter: ");
            int a = sc.nextInt();
            if (a > 0) {

                if (a < min) {
                    min = a;
                }
                if (a > max) {
                    max = a;
                }
            }
            if (a == 0) {
                    shouldContinue = false;
                }
            }

        System.out.println("MIN number was " + min + " while MAX number was " + max);
        }

}