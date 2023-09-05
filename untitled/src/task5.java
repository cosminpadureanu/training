import java.util.Scanner;

//Tasks
public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter time ");
        int time = scan.nextInt();

        System.out.println("amount of money : ");
        double amountOfMoney = scan.nextDouble();

        System.out.println("I am at work: write true or false:");
        boolean amIatWork = scan.nextBoolean();
        scan.close();

        if (!amIatWork) {
            if ((time >= 8) && (time <= 21)) {
                if (amountOfMoney > 10) {
                    System.out.println("it's a day and I have more than 10$. I will go to the cinema.");
                }
                else {
                    System.out.println("its a day and I have less than 10$. or I don't have money, Ill go for a walk");
                }
            }
            if (time >= 22 && time <= 24) {
                if (amountOfMoney > 20) {
                    System.out.println("it is night and I have more than 20$. I will go to a disco");
                }
                else {
                    System.out.println("it's night and I have less than 20$. I will go to sleep.");
                }
            }
        }
        else {System.out.println("I'm at work, I'll be working and won't be able to go out.");}
    }
}




