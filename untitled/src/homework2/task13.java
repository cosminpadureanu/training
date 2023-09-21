package homework2;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add positive number: ");
        int a = sc.nextInt();

        if ((a < 10) || (a > 300 )) {
            System.out.println("Number is mot in range 10-300 ");
        }
        for (int i = a; i >= 10; i--) {
             if (i % 7 == 0) {
                System.out.println(i);
             }
        }
    }
}
