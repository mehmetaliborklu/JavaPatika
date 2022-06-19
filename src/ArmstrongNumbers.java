
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayi Giriniz:");

        int girilenSayi = scanner.nextInt();
        int tempSayi = girilenSayi;
        int toplam = 0;
        int basamakSayisi = 0;

        //basamak sayisi bulma
        while (tempSayi != 0) {
            tempSayi /= 10;
            basamakSayisi++;
        }

        //rakam ve sonuç bulma
        tempSayi = girilenSayi;

        while (tempSayi != 0) {

            int üsToplam = 1;
            int rakam = tempSayi % 10;

            for (int i = 1; i <= basamakSayisi; i++) {
                üsToplam *= rakam;
            }
            toplam += üsToplam;
            tempSayi /= 10;

        }

        if (toplam == girilenSayi) {
            System.out.println(girilenSayi + " sayısı Armstrong sayıdır.");
        } else {
            System.out.println(girilenSayi + " sayısı Armstrong sayı değildir.");
        }


    }
}
