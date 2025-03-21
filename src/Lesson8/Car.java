package Lesson8;

public class Car {
    String color = "blue";
    String engine = "V6";
}

class Human {
    String name = "Ivan";
    final Car tesla = new Car();

    public static void main(String[] args) {
        Human logan = new Human();
        logan.tesla.engine = "V8";
    }
}
