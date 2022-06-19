import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class ÜslüSayiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayıyı Giriniz:");
        int number1 = scanner.nextInt();

        System.out.print("Kaçıncı Üssü Alınsın ? : ");
        int number2 = scanner.nextInt();

        int result = 1;

        if (number1 >= 0 && number2 >= 0 ) {
            for (int i = 1; i <= number2; i++) {
                result *= number1;
            }
        } else {
            return;
        }

        System.out.println("Sonuç: " + result);
    }
}
