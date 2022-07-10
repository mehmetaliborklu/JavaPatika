import java.util.Scanner;

public class PowCalculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int process = 1;
        while (process != 0) {
            System.out.print("İşlem Yapmak İçin : 1\nÇıkış Yapmak İçin : 0");
            process = scanner.nextInt();
            if ( process == 1) {
                System.out.print("Taban Sayıyı Girini:");
                int taban = scanner.nextInt();
                System.out.print("Üs olacak sayıyı Giriniz:");
                int üs = scanner.nextInt();
                System.out.println("Sonuç : " + Math.pow(taban, üs));
            }
        }
    }
}
