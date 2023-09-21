package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("1st element: ");
        int a1= sc.nextInt();
        System.out.print("2nd element: ");
        int a2 = sc.nextInt();

        int[] array = new int[10];
        array[0] = a1;
        array[1] = a2;

        for (int i = 2; i < array.length; i++) {
            int calc = (array[i - 2] + array[i - 1]);
            if (i % 2 == 0) {
                array[i] = calc * 3;
            } else {
                array[i] = calc / 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
