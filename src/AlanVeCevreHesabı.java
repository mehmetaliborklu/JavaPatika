import java.util.Scanner;

public class AlanVeCevreHesabı {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz:");
        int yaricap = scanner.nextInt();

        double cevre = 2*yaricap* Math.PI;
        double alan = Math.PI*yaricap*yaricap;

        System.out.println("Dairenin Çevresi:" + cevre);
        System.out.print("Dairenin Alanı:" + alan);
    }
}
