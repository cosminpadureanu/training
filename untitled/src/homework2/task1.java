package homework2;

import java.util.Scanner;

//Tasks
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add char ");
        char c = sc.next().charAt(0);

    switch (c) {
        case 'Y' :
            System.out.println("Yes");
            break;
        case 'y' :
            System.out.println("yes");
            break;
        case 'n' :
            System.out.println("No");
            break;
        case 'N' :
            System.out.println("No");
            break;
        default :
            System.out.println("wrong char");
        }
    }
}