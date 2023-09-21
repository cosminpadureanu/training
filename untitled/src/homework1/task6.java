package homework1;

import java.util.Scanner;

//Tasks
public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1 four-digit natural number from the keyboard that falls within the range 1000 – 9999");
        int number = scan.nextInt();

        int a = number / 1000;
        int b = (number % 1000) / 100;
        int c = (number % 100) / 10;
        int d = number % 10;

        int ad = (a * 10) + d;
        int bc = (b * 10) + c;

        if (number > 999 && number < 10000) {
            if (ad != bc) {
                if (ad > bc) {
                    System.out.println(ad + " > " + bc);
                } else {
                    System.out.println(ad + " < " + bc);
                }
            } else {
                System.out.println(ad + " = " + bc);
            }

        }
        else {System.out.println("number not in range 1000 – 9999 ");}
    }
}