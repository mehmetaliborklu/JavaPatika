import java.util.Scanner;

public class HormanikSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = scanner.nextInt();
        double sonuc = 0;

        for ( double i = 1; i <= sayi; i++){
            sonuc += (1/i);
        }

        System.out.println("Sonuç:"+ sonuc);
    }
}
