package homework2;

public class task3 {
    public static void main(String[] args) {
        boolean shouldContinue = true;
        int number = -101;
        while (shouldContinue) {
            number = number + 1;
            if (number > 99) {
                shouldContinue = false;
            }
            System.out.println(number);
        }
    }
}