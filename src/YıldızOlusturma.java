import java.util.Scanner;

public class YıldızOlusturma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Griniz:");
        int sayi = scanner.nextInt();

        for (int i = 1 ; i <= sayi; i++ ) {
            for ( int j = 1; j <= (sayi-i); j++) {
                System.out.print(" ");
            }
            for ( int k = 1; k <= (2*i) - 1 ; k ++ ) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
