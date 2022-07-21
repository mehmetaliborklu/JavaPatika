import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        int number;
        int hak = 5;
        double random = (Math.random() * 100) + 1;
        double randomNumber = Math.round(random);
        Scanner scanner = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {
            System.out.println("*********************");
            hak--;
            System.out.print("Tahmin Ettiğim Sayı: ");
            number = scanner.nextInt();
            if (number == randomNumber) {
                System.out.println("Tebrikler Doğru Tahmin Ettiniz, Sayı:" + randomNumber);
                break;
            } else {
                System.out.println("Kalan Hak:" + hak);
            }
        }

        if (hak == 0) {
            System.out.println("Oyun Bitti..");
        }
    }
}
