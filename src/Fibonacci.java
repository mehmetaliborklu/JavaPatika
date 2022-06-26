import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz:");
        int sayi = scanner.nextInt();

        ArrayList<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <= sayi; i++) {
            if ((i == 0)) {
                sayilar.add(i);
            } else if (i == 1){
                sayilar.add(i);
            }else {
                int toplam = sayilar.get(i-2) +sayilar.get(i-1);
                sayilar.add(toplam);
            }
        }

        sayilar.forEach(item -> {
            System.out.print(item + " ");
        });
    }
}
