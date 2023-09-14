package homework4;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("Write 2nd string: ");
        String str2 = sc.nextLine();

        if (str1.length() > str2.length()){
            System.out.println("The longest string is: " + str1);
            System.out.println(str1 + " - " + str1.length() + ", " + str2 + " - " + str2.length());
        }
        else if (str1.length() < str2.length()){
            System.out.println("The longest string is: " + str2);
            System.out.println(str1 + " - " + str1.length() + ", " + str2 + " - " + str2.length());
        }
        else {
            System.out.println("Strings are equal:");
            System.out.println(str1 + " - " + str1.length() + ", " + str2 + " - " + str2.length());
        }

    }
}