import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class CheckPasword {
    public static void main(String[] args) {
        String password = "test123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Şifrenizi Giriniz: ");

        String input = scanner.nextLine();


        if (!input.equals(password)) {
            System.out.println("YANLIŞ ŞİFRE!");
            System.out.print("Şifrenizi Yenilemek İstermisiniz?\nEvet:1, Hayır:2 ");

            int sonuc = scanner.nextInt();

            switch (sonuc) {
                case 1:
                    String a = scanner.nextLine();
                    System.out.print("Yeni Şifre Giriniz:");
                    String newPassword = scanner.nextLine();
                    boolean status = true;

                    while (status) {
                        if (newPassword.equals(password)) {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                            System.out.print("Yeni Şifre Giriniz:");
                            newPassword = scanner.nextLine();
                        } else {
                            System.out.println("Şifre oluşturuldu");
                            status = false;
                        }
                    }

                    break;
                case 2:
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("GİRİŞ BAŞARILI");
        }
    }
}
