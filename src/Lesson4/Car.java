package Lesson4;

public class Car {
    void Car (String cvet, String motor) {
        color = cvet;
        engine = motor;

        System.out.println("Car color: " + color);
        System.out.println("Car engine: " + engine);
    }
    String color;
    String engine;
}

class CarTest{
    public static void main(String[] args) {
        Car bmw = new Car();
        Car audi = new Car();
        bmw.Car ("red", "6");
        audi.Car ("blue", "12");
    }
}
