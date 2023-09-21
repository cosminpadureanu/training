package homework2;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        int a = 999;
        for (int i = 100; i <= a; ++i) {
            int a1 = i % 10;
            int a2 = (i / 10) % 10;
            int a3 = (i / 100) % 10;

            if (a1 != a2 && a1 != a3 && a2 != a3) {
                System.out.println(i);
            }
        }
    }
}
