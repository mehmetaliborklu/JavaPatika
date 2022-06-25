import java.util.Scanner;

public class ATM {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;
        boolean devam = true;

        System.out.print("Kullanıcı Adı:");
        String customerName = scanner.nextLine();

        System.out.print("Şifre:");
        int password = scanner.nextInt();

        if ( customerName.equals("test") && password == 123) {
            System.out.println("Giriş Yapılıyor...");
            Thread.sleep(2000);
            System.out.println("Giriş Başarılı");
            Thread.sleep(2000);

            while (devam) {

                System.out.println("**************************************");
                System.out.println("Lütfen İşlem Seçiniz");
                System.out.print("1. Bakiye Sorgulama\n2. Para Yatırma\n3. Para Çekme\n4. Çıkış\n");
                int process = scanner.nextInt();

                switch (process) {
                    case 1:
                        System.out.println("Toplam Bakiye : " + balance );
                        break;
                    case 2:
                        System.out.print("Yatırmak İstediğiniz Miktarı Giriniz : ");
                        int amount = scanner.nextInt();
                        balance += amount;
                        System.out.println("Toplam Bakiye : " + balance);
                        break;
                    case 3:
                        System.out.print("Çekmek İstediğiniz Miktarı Giriniz : ");
                        int amountWithDrawal = scanner.nextInt();
                        if (amountWithDrawal > balance) {
                            System.out.println("Yetersiz Bakiye");
                            break;
                        } else {
                            balance -= amountWithDrawal;
                            System.out.println("Toplam Bakiye : " + balance);
                        }
                        break;
                    case 4:
                        devam = false;
                        break;
                    default:
                        devam = false;
                        break;
                }
            }

        } else {
            System.out.println("Hatalı Kullanıcı Adı veya Şifre");
        }
    }
}
