package homework2;

public class task5 {
    public static void main(String[] args) {
        boolean shouldContinue = true;
        int number = 51;
        while (shouldContinue) {
            number--;
            if (number < 2) {
                shouldContinue = false;
            }

                System.out.println(number);

        }
    }
}