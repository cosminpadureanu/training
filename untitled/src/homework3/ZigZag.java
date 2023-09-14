package homework;

public class ZigZag {
    public static void main(String[] args) {
//        int[] array = { 1, 12, 3, 14, 5, 16, 7, 18, 9 };
        int[] array = { 12, 3, 14, 5, 16, 7, 18, 9, 17 };
        boolean isZigZag = true;

        // N1 < N2 > N3 < N4 > N5 < … > Ni < Nj > … < Nn
        //  0 <  1 >  2 <  3 > 4 ... even indexes are smaller than odd indexes
        for (int index = 0; index < array.length - 1; index++){
            // even index
            if (index % 2 == 0) {
                if (!(array[index] < array[index + 1])) {
                    isZigZag = false;
                    break;
                }
            } else {
                // if NOT odd > even
                if (!(array[index] > array[index + 1])) {
                    isZigZag = false;
                    break;
                }
            }
        }

        if (isZigZag) {
            System.out.println("Array is Zigzag! ... N1 < N2 ");
            return;
        }

        isZigZag = true;
        // N1 > N2 < N3 > N4 < N5 > … < Ni > Nj < … > Nn
        //  0 > 1  < 2  > 3  < 4 ...
        for (int index = 0; index < array.length - 1 ; index++) {
            if (index % 2 == 0) { // even index
                if (!(array[index] > array[index + 1])) {
                    isZigZag = false;
                    break;
                }
            } else { // odd index
                // if NOT odd < even
                if (!(array[index] < array[index + 1])) {
                    isZigZag = false;
                    break;
                }
            }
        }

        if (isZigZag) {
            System.out.println("Array is Zigzag!... N1 > N2");
        } else {
            System.out.println("NOT ZigZag. (N1 > N2)");
        }
    }
}
