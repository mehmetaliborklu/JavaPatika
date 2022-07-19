import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        String[][] arr = new String[7][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    arr[i][j] = "*";
                } else if (j == 0 || j == 3) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[0].length; k++) {
                System.out.print(arr[i][k] + " ");

            }
            System.out.println("");
        }


    }
}
