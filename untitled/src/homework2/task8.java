package homework2;

import java.util.Scanner;


public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add positive number: ");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Number is negative or 0, try again ");
        } else if (a > 0) {
            int c = 0;
            for (int i = 3; c < a; i+=3, c++) {
                System.out.print(i);
                if( c+1 < a ) {
                    System.out.print(",");
                }
            }
        }
    }
}