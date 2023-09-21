package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Array Size is 10 ");
        int n = 10;
        int[] array1 = new int[n];
        System.out.println(" Enter Array elements1: ");
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        int[] array2 = new int[n];
        System.out.println(" Enter Array elements2: ");
        for (int i = 0; i < n; i++) {
            array2[i] = sc.nextInt();
        }

        if (Arrays.equals(array1, array2)) {
            System.out.println("The arrays are Identical");
        } else {
            System.out.println("The arrays are not identical");
        }
    }
}

