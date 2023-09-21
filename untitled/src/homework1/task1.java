package homework1;

import java.util.Scanner;

//Tasks
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Running TASK 1-----------");
        System.out.println("Enter A: ");
        float a = sc.nextFloat();

        System.out.println("Enter B: ");
        float b = sc.nextFloat();

        System.out.println("Enter C: ");
        float c = sc.nextFloat();

        if (c > a && (c < b && a < b)) {
            System.out.println(c + " is between " + a + " and " + b);
        } else if (a > c && (c > b && a > b)) {
            System.out.println(c + " is between " + b + " and " + a);
        } else {
            System.out.println(c + " is NOT between " + a + " and " + b);
        }
    }
}