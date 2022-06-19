import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz:");
        int number = scanner.nextInt();

        for ( int i = 1 ; i<=number; i *=4) {
            System.out.println(i);
        }

        System.out.println("------------------------------------------");
        for ( int i = 1 ; i<=number; i *=5) {
            System.out.println(i);
        }
    }
}
