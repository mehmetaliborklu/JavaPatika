import java.util.Random;

public class Match {
    Fighter fighter1;
    Fighter fighter2;

    Match(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        hit();
    }

    void hit() {
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("************************************");
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            if (randomNumber > 50) {
                System.out.println(fighter2.name + " " + fighter1.name + "\'e vuruş yaptı.");
                fighter1.power();
                System.out.println(fighter1.name + " Toplam Güç:" + " " + fighter1.power);
                System.out.println(fighter2.name + " Toplam Güç:" + " " + fighter2.power);
            } else {
                System.out.println(fighter1.name + " " + fighter2.name + "\'e vuruş yaptı.");
                fighter2.power();
                System.out.println(fighter1.name + " Toplam Güç:" + " " + fighter1.power);
                System.out.println(fighter2.name + " Toplam Güç:" + " " + fighter2.power);
            }

            if (fighter1.power <= 0 || fighter2.power <= 0) {
                isContinue = false;
                if (fighter1.power <= 0) {
                    System.out.println("Kazanan\t"+ fighter2.name);
                } else {
                    System.out.println("Kazanan\t"+ fighter1.name);
                }
            }
        }

    }

}
