public class MinMaxValueArrays {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 10, 2, 28, 30, 11, 24, 48, 1};
        int min = numbers[0];
        int max = numbers[0];

        for (int i : numbers) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Eleman: "+min+"\nMaximum Eleman: "+max);
    }
}
