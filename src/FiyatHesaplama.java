import java.util.Scanner;

public class FiyatHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kg? : " );
        int armut = scanner.nextInt();

        System.out.print("Elma Kaç Kg? : ");
        int elma = scanner.nextInt();

        System.out.print("Domates Kaç Kg? : ");
        int domates = scanner.nextInt();

        System.out.print("Muz Kaç Kg? : ");
        int muz = scanner.nextInt();

        System.out.print("Patlıcan Kaç Kg? : ");
        int patlıcan = scanner.nextInt();

        double toplamTutar = armut* (2.14) + elma* (3.67) + domates*(1.11)+ muz*(0.95)+ patlıcan*(5);

        System.out.println("Toplam Tutar : " +toplamTutar);

    }
}
