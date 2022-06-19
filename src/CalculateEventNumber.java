import java.util.Scanner;

public class CalculateEventNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;

        do {
            System.out.print("Bir sayi giriniz:");
            number = scanner.nextInt();

            if (number %4 == 0) {
                total += number;
            }
        } while (number > 0);

        System.out.println(total);
    }
}
