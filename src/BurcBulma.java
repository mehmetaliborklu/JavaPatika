import javax.print.attribute.standard.Finishings;
import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        String burc = "" ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay:");
        int month = scanner.nextInt();

        if ( month > 13 || month < 0) {
            System.out.println("Hatalı bir giriş yaptınız");
            System.exit(0);
        }

        System.out.print("Doğduğuz Gün:");
        int day = scanner.nextInt();

        switch (month) {
            case 1:
                if ( day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
                break;
            case 2:
                if ( day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
                break;
            case 3:
                if ( day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
                break;
            case 4:
                if ( day < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
                break;
            case 5:
                if ( day < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
                break;
            case 6:
                if ( day < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
                break;
            case 7:
                if ( day < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
                break;
            case 8:
                if ( day < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
                break;
            case 9:
                if ( day < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
                break;
            case 10:
                if ( day < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
                break;
            case 11:
                if ( day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
                break;
            case 12:
                if ( day < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
                break;
            default:
                break;
        }
        System.out.println("Burcunuz : " + burc );
    }
}
