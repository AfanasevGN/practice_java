package Lesson9;

public class Car {
    int z = 5;

    String color;
    String engine;
    int a = 10;
    static int count;

    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    void changeColor(String color) {
        this.color = color;
        System.out.println(color);
    }

    public static void main(String[] args) {
        Car car = new Car("red", "V6");
        System.out.println(car.color);
        car.changeColor("black");
        System.out.println(car.color);
    }

}
