import java.util.Scanner;

public class CalculateHıpotenus {

    public static void main(String[] args) {

        System.out.print("Üçgenin 1. Kenar Uzunluğu:");
        Scanner input = new Scanner(System.in);
        int kenar1 = input.nextInt();

        System.out.print("Üçgenin 2. Kenar Uzunluğu:");
        Scanner input2 = new Scanner(System.in);
        int kenar2 = input2.nextInt();

        System.out.print("Üçgenin 3. Kenar Uzunluğu:");
        Scanner input3 = new Scanner(System.in);
        int kenar3 = input3.nextInt();

        int hipotenüs = (kenar1*kenar1) + (kenar2*kenar2) + (kenar3*kenar3);

        System.out.println("Hipotenüs :"+ hipotenüs);

    }
}
