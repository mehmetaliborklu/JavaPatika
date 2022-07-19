public class ArraysAverage {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        int[] point = {2, 10, 60, 100};

        System.out.println(calculateAverage(numbers));
        System.out.println(calculateAverage(point));
    }

    static double calculateAverage(int[] arr) {
        double average;
        int toplam = 0;
        for (int i : arr) {
            toplam += i;
        }
        average = toplam / arr.length;
        return average;
    }
}
