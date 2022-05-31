import java.util.Scanner;

public class NotHesapla {

    public static void main(String[] args) {
        double mat, fiz, kim, tarih, trk, mzk;

        Scanner notlar = new Scanner(System.in);

        System.out.print("Lütfen Matematik notunuzu giriniz:");
        mat = notlar.nextDouble();

        System.out.println("Lütfen fizik notunuzu giriniz:");
        fiz = notlar.nextDouble();

        System.out.println("Lütfen kimya notunuzu giriniz:");
        kim = notlar.nextDouble();

        System.out.println("Lütfen tarih notunuzu giriniz:");
        tarih = notlar.nextDouble();

        System.out.println("Lütfen türkçe notunuzu giriniz:");
        trk = notlar.nextDouble();

        System.out.println("Lütfen müzik notunuzu giriniz:");
        mzk = notlar.nextDouble();

        double ort = (mat+fiz+kim+tarih+trk+mzk) / 6;

        System.out.println(ort);

        String message = ort >= 60 ? "geçti" : "kaldı";

        System.out.println(message);
    }

}
