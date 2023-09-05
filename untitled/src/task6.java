import java.util.Scanner;

//Tasks
public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1 four-digit natural number from the keyboard that falls within the range 1000 – 9999");
        int number = scan.nextInt();

        int a = number / 100;
        int b = number % 100;

        if (number > 999 && number < 10000) {
            if (a != b) {
                if (a > b) {
                    System.out.println(a + " > " + b);
                } else {
                    System.out.println(a + " < " + b);
                }
            } else {
                System.out.println(a + " = " + b);
            }

        }
        else {System.out.println("number not in range 1000 – 9999 ");}
    }
}