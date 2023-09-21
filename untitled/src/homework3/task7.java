package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Array Size is 10 ");
        int n = 10;
        int[] array1 = new int[n];
        System.out.println(" Enter Array elements1: ");
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        int maxLength = 1;
        int currentLength = 1;
        int longestIndex = 0;

        for (int i = 1; i < array1.length; i++) {
            if (array1[i] == array1[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestIndex = i - maxLength + 1;
            }
        }
        for (int i = longestIndex; i < longestIndex + maxLength; i++) {
            System.out.print(array1[i] + " ");

        }

    }
}

