import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        double mat = scanner.nextDouble();

        System.out.print("Fizik Notu: ");
        double fiz = scanner.nextDouble();

        System.out.print("Türkçe Notu: ");
        double trk = scanner.nextDouble();

        System.out.print("Kimya Notu: ");
        double kmy = scanner.nextDouble();

        System.out.print("Müzik Notu: ");
        double mzk = scanner.nextDouble();

        double ort = (mat+fiz+kmy+trk+mzk) / 5 ;

        String result = ort > 55 ? "GEÇTİNİZ" : "KALDINIZ";
        System.out.println(result);


    }
}
