import java.util.Scanner;

public class KDVHesapla {

    public static void main(String[] args) {
        //KDV rate = %18

        double kdvRate;
        Scanner input = new Scanner(System.in);
        System.out.print("LÜTFEN MİKTAR GİRİNİZ:");

        int miktar = input.nextInt();

        if (miktar > 0 && miktar <= 1000) {
            kdvRate = 0.18;
        } else {
            kdvRate = 0.08;
        }

        double kdvFiyat = miktar+(miktar*kdvRate);

        System.out.println("KDV\'siz Fiyat: " + miktar+"\n"+ "KDV\'li Fiyat:"+kdvFiyat);
    }
}
