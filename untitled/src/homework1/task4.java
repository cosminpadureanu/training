package homework1;

import java.util.Scanner;

//Tasks
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        System.out.println("Enter C: ");
        int c = sc.nextInt();

        int a1 = a;

        a = b;
        b = c;
        c = a1;

        System.out.println("A is: " + a + " B is: " + b  +" new c is: " + c);

    }





}