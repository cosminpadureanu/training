package homework2;

import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add positive number: ");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Number is negative or 0, try again ");
        }
        if (a > 0) {
            for (int i = 2; i <= a; ++i) {

                if ((a % i == 0) && (a > i)) {
                    System.out.println("Not prime number: " + a);
                    break; // if there is a divisible smaller number, than tha actual number , will stop
                }
                if ((a % i == 0) && (a == i)) {
                System.out.println("Prime number: " + a);

                }
            }
        }
    }
}