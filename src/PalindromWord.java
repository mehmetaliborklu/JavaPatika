import java.util.Scanner;

public class PalindromWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.print("Lütfen Bir Kelime Giriniz: ");
        String word = scanner.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        System.out.println("Kelimenin Tersi: "+stringBuilder);

        if (word.equals(String.valueOf(stringBuilder))){
            System.out.println("Girilen kelime palindromiktir.");
        } else {
            System.out.println("Girilen kelime palindromik değildir.");
        }
    }
}
