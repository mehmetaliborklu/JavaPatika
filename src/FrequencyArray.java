public class FrequencyArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 30, 40, 10, 30, 1, 2, 1, 40, 40, 40};
        int[] duplicate = new int[numbers.length];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;

                }
            }
            if ((count > 1) && !isFind(duplicate, numbers[i])) {
                duplicate[index++] = numbers[i];
                System.out.println(numbers[i] + " sayısı " + count + " defa tekrar etmiştir.");
            }
        }
    }

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
