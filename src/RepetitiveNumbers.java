import java.util.Arrays;

public class RepetitiveNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 10, 20, 30, 10, 2, 40, 20, 1, 0};
        int[] duplicate = new int[numbers.length];
        int indexNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if ( numbers[i] == numbers[j]) {
                    count++;
                    if (count >= 2 && !isFind(duplicate, numbers[i])) {
                        duplicate[indexNumber++] = numbers[i];
                    }
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));
    }

    static boolean isFind(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
