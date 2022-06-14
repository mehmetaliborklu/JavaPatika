import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz:");
        int sayi1 = scanner.nextInt();

        System.out.print("2. Sayıyı Giriniz:");
        int sayi2 = scanner.nextInt();

        System.out.print("3. Sayıyı Giriniz:");
        int sayi3 = scanner.nextInt();

        int enBuyuk = sayi3;
        if ( sayi1 > sayi2 && sayi1 > sayi3 ) {
            enBuyuk = sayi1;
        } else if ( sayi2 > sayi1 && sayi2 > sayi3 ) {
            enBuyuk = sayi2;
        }

        System.out.println("En Büyük Sayı : " + enBuyuk);
    }
}
