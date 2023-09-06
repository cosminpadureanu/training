package homework2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please and 1st number: ");
        int a = sc.nextInt();
        System.out.println("Please and 2nd number: ");
        int b = sc.nextInt();

        if (a < b){
             boolean shouldContinue = true;
             System.out.println(a);
             while (shouldContinue) {
                  a = a + 1;
                 if (b == a) {
                      shouldContinue = false;
                 }
                 System.out.println(a);
             }
        }
        if (a > b){
            boolean shouldContinue = true;
            System.out.println(b);
            while (shouldContinue) {
                b = b + 1;
                if (b == a) {
                    shouldContinue = false;
                }
                System.out.println(b);
            }
        }
        if (a == b) {
            System.out.println("Numbers are equal, try again");
        }
    }
}