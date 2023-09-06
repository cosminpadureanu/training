package homework2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        boolean shouldContinue = true;
        int number = 0;
        while (shouldContinue) {
            number = number + 1;
            if (number > 999) {
                shouldContinue = false;
            }
            System.out.println(number);
        }
    }
}