import java.util.Random;

public class Fighter {
    String name;
    int power = 100;

    Fighter(String name) {
        this.name = name;
    }

    void power() {
        Random random = new Random();
        int randomNumber = random.nextInt(30)+1;
        power -= randomNumber;
    }
}
