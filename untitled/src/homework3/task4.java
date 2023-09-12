package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size is?:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println(" Enter Array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {

                break;
            }

            else {
                System.out.println("Array is mirrored");
            }
            System.out.println("Array is not mirrored");
        }
    }
}
