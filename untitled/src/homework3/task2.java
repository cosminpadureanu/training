package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        int n= 10;
        Scanner sc=new Scanner(System.in);
        System.out.print("Array Size is:" + n );
//        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println(" Enter Array elements: ");
        for(int i=0; i<n; i++) {
            array[i]=sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            System.out.println(array[i]);
        }

        int[] otherArray = new int[array.length];
        System.arraycopy(array, array.length / 2, otherArray, 0, array.length / 2);
        for (int i = 0; i < array.length / 2; i++) {
            otherArray[array.length / 2 + i] = array[array.length - 1 - i];
            }
        System.out.println(Arrays.toString(otherArray));
        }
}
