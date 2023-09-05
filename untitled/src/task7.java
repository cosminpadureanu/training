import java.util.Scanner;

//Tasks
public class task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please 1st number");
        int a = scan.nextInt();

        System.out.println("Please 2nd number");
        int b = scan.nextInt();

        int prod = a * b;
        int mod = prod % 2;
        int mod2 = prod % 10;

        if (mod == 0) {
           System.out.println(prod + " Number is even");
                }
                else {
                    System.out.println(prod + " Number is odd");
                }

        if(mod2 % 3 == 0) {
            System.out.println("Last digit " + mod2 + " is divisible by 3");
        } else {
            System.out.println("last digit  " + mod2 + " is not divisible by 3");
        }
    }
}