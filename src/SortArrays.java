import java.util.Arrays;
import java.util.Scanner;

public class SortArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;

        System.out.print("Dizi kaç elamanlı olsun?: ");

        int numberElements = scanner.nextInt();
        numbers = new int[numberElements];

        for (int i = 0; i < numberElements; i++ ) {
            System.out.print("Dizinin " +(i+1)+".elemanını giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
