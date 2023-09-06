package homework2;

public class task4 {
    public static void main(String[] args) {
        boolean shouldContinue = true;
        int number = -31;
        while (shouldContinue) {
            number = number + 1;
            if (number > 29) {
                shouldContinue = false;
            }
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}