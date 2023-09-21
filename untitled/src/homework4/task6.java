package homework4;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word containing digits: ");
        String word = sc.next();

        int sum = 0;
        for(int i=0; i<word.length(); i++){
            if(Character.isDigit(word.charAt(i))){
                sum+=word.charAt(i)-'0';
            }
        }
        System.out.println(sum);
        }

}