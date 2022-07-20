import java.util.Scanner;

public class Transpoze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[2][3];
        int[][] transpoz = new int[3][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Bir sayı giriniz: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[0].length; j++ ) {
                transpoz[i][j] = arr [j][i];
            }
        }
        System.out.println("Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpoz");
        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[0].length; j++) {
                System.out.print(transpoz[i][j]);
            }
            System.out.println();
        }
    }
}
