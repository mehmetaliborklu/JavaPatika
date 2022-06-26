import java.util.Scanner;

public class MükemmelSayi {
    public static void main(String[] args) {
        int toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı Giriniz:");

        int sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi %i == 0 ) {
                toplam += i;
            }
        }

        if ( toplam == sayi) {
            System.out.println(sayi + " bir mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }
    }
}
