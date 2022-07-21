import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int column;
    int mineNumber = 0;
    int sayac = 0;
    boolean isContinue = true;
    String[][] mine;
    String[][] copyArray;

    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
    }

    void run() {
        createArray();
        System.out.println("---------------------------------");

        while (this.isContinue) {
            this.sayac++;
            if ((this.row * this.column) - this.sayac < this.mineNumber) {
                System.out.println("TEBRİKLER KAZANDINIZ :)");
                break;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Satır Sayısı Giriniz:");
            int row = scanner.nextInt();

            System.out.print("Sütun Sayısı Giriniz:");
            int column = scanner.nextInt();

            if (!mine[row][column].equals("*")) {
                copyArray[row][column] = "1";
                for (int i = 0; i < copyArray.length; i++) {
                    for (int j = 0; j < copyArray[0].length; j++) {
                        System.out.print(copyArray[i][j]);
                    }
                    System.out.println();
                }
            } else {
                this.isContinue = false;
                System.out.println("Game Over");
                printArray(mine);
            }

        }

    }

    void printArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    void createArray() {
        mine = new String[this.row][this.column];
        copyArray = new String[this.row][this.column];
        this.mineNumber = (this.row * this.column) / 4;

        Random random = new Random();

        for (int i = 0; i < mine.length; i++) {
            for (int j = 0; j < mine[0].length; j++) {
                mine[i][j] = "-";
                copyArray[i][j] = "-";
            }
        }

        for (int i = 0; i < mineNumber; i++) {
            int randomRow = Math.round(random.nextInt(this.row));
            int randomColumn = Math.round(random.nextInt(this.column));
            mine[randomRow][randomColumn] = "*";
        }
    }
}
