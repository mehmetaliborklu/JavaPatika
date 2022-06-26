import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MinAndMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AtomicInteger max = new AtomicInteger();
        AtomicInteger min = new AtomicInteger();

        System.out.print("Kaç Sayı Girilecek:");
        int number = scanner.nextInt();

        ArrayList<Integer> numberList = new ArrayList();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + ".Sayıyı Giriniz:");
            int value = scanner.nextInt();
            numberList.add(value);
            if (i == 1) {
                max.set(value);
                min.set(value);
            }

            numberList.forEach(item -> {
                int biggerNumber = item > max.get() ? item : max.get();
                max.set(biggerNumber);

                int littleNumber = item < min.get() ? item : min.get();
                min.set(littleNumber);

            });
        }

        System.out.println("En büyük sayı : " + max+"\n"+"En küçük sayı: "+min);
    }
}
