package Lesson4;

public class Car {
    String color="red";
    String engine="V6";
}

class CarTest{
    public static void main(String[] args) {
        int a;
        Car bmw = new Car();
        bmw.color="black";
        bmw.engine="V8";


        System.out.println("color: " + bmw.color);
        System.out.println("engine: " + bmw.engine);
    }
}
