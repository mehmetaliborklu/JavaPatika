import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int tempNumber;
        StringBuilder reversedNumber = new StringBuilder();
        

        System.out.print("Lütfen Bir Sayı Giriniz:");
        number = scanner.nextInt();
        tempNumber = number;
        while (tempNumber > 0) {
            int remainsNumber = tempNumber % 10;
            reversedNumber.append(remainsNumber);
            tempNumber /= 10;
        }

        if ( number == Integer.parseInt(String.valueOf(reversedNumber))) {
            System.out.println(number + " sayısı palindrom sayıdır.");
        } else {
            System.out.println(number + " sayısı palindrom sayı değildir.");
        }

    }
}
