package homework;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /**
         * Task 9
         * Please enter an integer from the keyboard in the range [0-100].
         * Based on the number entered, print a message in the console about how likely it is to rain. Business logic should be based on the following intervals:
         * 	0 – it will not rain
         * 	Between 0 and 5 - minimal chance of precipitation
         * 	Between 5 and 20 - a small chance of precipitation
         * 	Between 20 and 50 - there is a chance of precipitation
         * 	Between 50 and 80 - high chance of precipitation
         * 	Between 80 and 100 - it will rain
         */
        System.out.println("Enter number [0-100]");
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();

        if (userNumber < 0 || userNumber > 100) {
            System.err.println("Wrong number must be [0 - 100]");
        } else {
            if (userNumber == 0){
                System.out.println("it will not rain");
            } else if (userNumber <= 5) {
                System.out.println("minimal chance of precipitation");
            } else if (userNumber <= 50) {
                System.out.println("there is a chance of precipitation");
            } else if (userNumber <= 80) {
                System.out.println("high chance of precipitation");
            } else if (userNumber <= 100) {
                System.out.println("it will rain");
            }
        }

    }
}
