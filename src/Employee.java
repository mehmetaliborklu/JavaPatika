import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax = 0;
        if (salary > 1000) {
            tax = (salary * 3) / 100;
        }
        System.out.println("Vergi: " + tax);
        return tax;
    }

    double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            bonus = ( workHours - 40 ) * 30;
        }
        System.out.println("Bonus: " + bonus);
        return bonus;
    }

    double raiseSalary() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("YYYY");
        int diff = Integer.parseInt(dateFormat.format(date)) - hireYear;
        double raise = 0;
        if (diff < 10) {
            raise = salary * 0.05;
        } else if (diff >= 10 && diff < 20) {
            raise = salary * 0.10;
        } else if (diff >= 20) {
            raise = salary * 0.15;
        }

        System.out.println("Maaş Artışı: " + raise);
        return raise;
    }

    void printInfo() {
        System.out.println("****************************************");

        System.out.println("İsim: " + name + "\nMaaşı: " + salary + "\nÇalışma Saati: " + workHours + "\nBaşlangıç Yılı: " + hireYear);

        System.out.println("Vergi ve Bonuslar İle Maaş: "+ (salary+ bonus()+raiseSalary()- tax()));
    }
}
