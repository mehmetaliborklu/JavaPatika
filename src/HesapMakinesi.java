import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplama İşlemi İçin 1 \nÇıkarma İşlemi İçin 2\nÇarpma İşlemi İçin 3\nBölme İşlemi İçin 4 Yazınız");
        int islem = scanner.nextInt();

        System.out.print("1. Sayıyı Giriniz:");
        int sayi1 = scanner.nextInt();

        System.out.print("2.Sayıyı Giriniz:");
        int sayi2 = scanner.nextInt();

        double sonuc = 0;

        switch (islem) {
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Sayı 0'a bölünemez");
                }

                break;
            case 4:
                sonuc = sayi1 * sayi2;
                break;
            default:
                System.out.println("Geçersiz İşlem");
        }

        System.out.println("Sonuç : " + sonuc);
    }
}
