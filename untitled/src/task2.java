import java.util.Scanner;

//Tasks
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Running TASK 2-----------");
        System.out.println("Enter A: ");
        float a1 = sc.nextFloat();
        System.out.println("Enter B: ");
        float b1 = sc.nextFloat();
        float sum = a1 + b1;
        float dif = a1 - b1;
        float prod = a1 * b1;
        float rem = a1 % b1;
        float div = a1 / b1;
        System.out.println("sum is: " + sum);
        System.out.println("difference is: " + dif);
        System.out.println("product is: " + prod);
        System.out.println("remainder of division is: " + rem);
        System.out.println("integer division  is: " + div );


    }





}