package homework2;

public class task15 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
            for (int a = 1; a <= 10; a++) {
                for (int b = a; b <= 10; b++) {
                    System.out.print(a + "*" + b);
                    if (b < 10) {
                        System.out.print("; ");
                    } else {
                        System.out.println();
                    }
                }
            }
        }

}
