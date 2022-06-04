import java.util.Scanner;

public class VucutKitleIndexi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz:");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz:");
        double kilo = scanner.nextDouble();

        double vKi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndexi :" +vKi);


    }
}
