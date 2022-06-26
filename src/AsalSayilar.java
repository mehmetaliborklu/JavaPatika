import java.util.ArrayList;

public class AsalSayilar {
    public static void main(String[] args) {
        ArrayList<Integer> asalSayilar = new ArrayList<>();
        int counter;

        for (int i = 1; i <= 100; i++) {
            counter = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0.0) {
                    counter++;
                }
            }

            if (counter == 2) {
                asalSayilar.add(i);
            }
        }
        System.out.println(asalSayilar);
    }
}
