import java.util.Scanner;

public class FlıghtPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaş:");
        int age = scanner.nextInt();

        System.out.print("Km:");
        double km = scanner.nextInt();

        System.out.print("Yolculuk Tipi : ");
        int type = scanner.nextInt();

        double amountPerKm = 0.10;
        int saleRate;
        double totalAmount = amountPerKm * km;

        if ( age >= 0 && km >= 0 && type >= 0 ) {

            switch (type) {
                case 1:
                    if ( age < 12) {
                        totalAmount -= totalAmount * (0.5);
                    } else if ( age >= 12 && age < 24 ) {
                        totalAmount -= totalAmount * (0.10);
                    } else if ( age > 65 ) {
                        totalAmount -= totalAmount * (0.3);
                    }
                    break;

                case 2:
                    if ( age < 12) {
                        double yasIndırımlı = ( totalAmount - ( totalAmount * (0.50) ) );
                        totalAmount = (yasIndırımlı - (yasIndırımlı * ( 0.2 ) )) * 2;
                    } else if ( age >= 12 && age < 24 ) {
                        double yasIndırımlı = ( totalAmount - ( totalAmount * (0.10) ) );
                        totalAmount = (yasIndırımlı - (yasIndırımlı * ( 0.2 ) )) * 2;
                    } else if ( age > 65 ) {
                        double yasIndırımlı = ( totalAmount - ( totalAmount * (0.30) ) );
                        totalAmount = (yasIndırımlı - (yasIndırımlı * ( 0.2 ) )) * 2;
                    }
                    break;
            }
            System.out.println("Toplam Fiyat:" + totalAmount);
        } else {
            System.out.println("Hatalı Bir Giriş Yaptınız");
        }
    }
}
