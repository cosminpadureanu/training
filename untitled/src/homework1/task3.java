package homework1;

import java.util.Scanner;

//Tasks
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Running TASK 2-----------");
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        if (a < b) {
            System.out.println("Ascending order: " + a + b);
            System.out.println("Desc order: " + b + a);
        } else if (a > b) {
            System.out.println("Ascending order: " + b + a);
            System.out.println("Desc order: " + a + b);
        } else {
            System.out.println("numbers are equal");
        }

    }





}