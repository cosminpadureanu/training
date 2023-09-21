package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Array Size is 10 ");
        int n = 10;
        int[] array = new int[n];
        System.out.println(" Enter Array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            array[j] = array[j] * 4;
        }
        System.out.println(Arrays.toString(array));
    }
}

