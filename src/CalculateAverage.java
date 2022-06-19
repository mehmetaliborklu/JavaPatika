import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz:");
        int number = scanner.nextInt();
        int total = 0;
        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if ( i %3 == 0 && i%4 == 0) {
                total += i;
                counter++;
            }
        }

        double average = total / counter;

        System.out.println("Ortalama : " + average );



    }
}
