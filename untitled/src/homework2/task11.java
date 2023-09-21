package homework2;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add positive number: ");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Number is negative or 0, try again ");
        }
        String b = "*";
        if (a > 0) {
            for (int i = 1; i <= a; ++i) {
                String c = b.repeat(i);
                System.out.println(c);

                }
            }
        }
    }
