import java.math.BigDecimal;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        System.out.print("Lütfen KM bilgisi giriniz:");
        Scanner scanner = new Scanner(System.in);
        double km = scanner.nextDouble();
        BigDecimal tutar = (new BigDecimal("2.20").multiply(new BigDecimal(km))).add(BigDecimal.valueOf(10));

        if (tutar.compareTo(BigDecimal.valueOf(20)) < 0) {

            tutar = BigDecimal.valueOf(20);
        }

        System.out.println(tutar);
    }
}
