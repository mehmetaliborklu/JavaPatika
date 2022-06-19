import java.util.Scanner;

public class CalculateCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz:");
        int sayi1 = scanner.nextInt();

        System.out.print("2. Sayıyı Giriniz:");
        int sayi2 = scanner.nextInt();

        if ( sayi1 < sayi2) {
            return;
        }

        int fact1 = 1;
        int fact2 = 1;
        int fact3 = 1;

        for (int i = 1; i <= sayi1; i++) {
            fact1 *= i;
        }

        for (int i = 1; i <= (sayi1 - sayi2); i++) {
            fact2 *= i;
        }

        for (int i = 1; i <= sayi2; i++) {
            fact3 *= i;
        }

        double comb = fact1 / (fact3*fact2);

        System.out.println(comb);

    }
}
