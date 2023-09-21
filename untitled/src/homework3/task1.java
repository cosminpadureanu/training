package homework3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        int n= 12;
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

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 5) == 0 && array[i] > max){
                max = array[i];
            }
        }
        System.out.println("max number is: " + max);
    }
}
