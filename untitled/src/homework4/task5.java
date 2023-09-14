package homework4;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();

        if(word.equals(new StringBuilder(word).reverse().toString())){
            System.out.println("is palindrome");
        }
        else  {
            System.out.println("is NOT palindrome");
        }
    }
}