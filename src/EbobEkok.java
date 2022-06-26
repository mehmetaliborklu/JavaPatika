import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ebob = 1;
        int ekok = 1;

        System.out.print("Ebobu Bulunacak 1.Sayıyı Giriniz:");
        int firstNumber = scanner.nextInt();

        System.out.print("Ebobu Bulunacak 2. Sayıyı Giriniz:");
        int secondNumber = scanner.nextInt();

        int littleNumber = firstNumber;

        if (secondNumber < firstNumber) {
            littleNumber = secondNumber;
        }

        for (int i = littleNumber; i >= 1; i--) {

            int remainderFromFirst = firstNumber % i;
            int remainderFromSecond = secondNumber % i;

            if ( remainderFromFirst == 0 && remainderFromSecond == 0) {
                ebob = i;
                break;
            }
        }

        for (int i = 1; i <= (firstNumber*secondNumber); i++) {
            int remainderFromFirst = i % firstNumber;
            int remainderFromSecond = i % secondNumber;

            if (remainderFromFirst == 0 && remainderFromSecond == 0) {
                ekok = i;
                break;
            }
        }

        System.out.println("EBOB:" + ebob);
        System.out.println("EKOK:" + ekok);
    }
}
