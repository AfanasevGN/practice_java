package Lesson5;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("Cvet: " + color);
        System.out.println("Motor: " + engine);
        System.out.println("Skorost: " + speed);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 bmw = new Car2();
        bmw.color = "white";
        bmw.engine = "V6";
        bmw.speed = 60;

        bmw.showInfo();

        bmw.gaz(20);
        bmw.showInfo();

        bmw.tormoz(80);
        bmw.showInfo();

    }
}

