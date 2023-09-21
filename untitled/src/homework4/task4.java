package homework4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter sentence with spaces: ");
                String str = sc.nextLine();
                String[] splited = str.split(" ");

                StringBuilder last = new StringBuilder();

                for (String word : splited) {
                    String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                    last.append(capitalized).append(" ");

                }
                System.out.println(last);
    }
}