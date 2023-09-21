package homework4;

import java.util.Scanner;

import java.util.Locale;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write 50 characters: ");
        String str = sc.nextLine();

        if (str.isEmpty() || str.length() > 50) {
            System.err.println("Please enter at least 1 char and no more then 50!");
        } else {
            System.out.println(str.toUpperCase() + ", " + str.toLowerCase());
        }
    }
}