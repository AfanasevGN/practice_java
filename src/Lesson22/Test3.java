package Lesson22;

import javax.print.Doc;

public class Test3 {
  void uvelichitZP(Employee e) {
    e.salary = e.salary + 100;
  }

  public static void main(String[] args) {
    Doctor doc = new Doctor();
    doc.name = "Ivan";
    doc.age = 50;
    doc.experience = 25;
    doc.eat();
    doc.sleep();
    doc.heel();
  }
}

class Employee {
  double salary = 100;
  String name;
  int age;
  int experience;

  void eat() {
    System.out.println("Kushat");
  }

  void sleep() {
    System.out.println("Spat");
  }
}

class Doctor extends Employee {

  void heel() {
    System.out.println("Lechit");
  }
}

class Hirurg extends Doctor {
  String skalpel;
  void operaciya() {}
}

class Dantist extends Doctor {
  String borMachine;
  void airFlow() {

  }
}

class Teacher {
  int kolichestvoUchenikov;

  void teach() {
    System.out.println("Uchit");
  }
}

class Driver {
  String nazvanieMashiny;

  void drive() {
    System.out.println("Vodit");
  }
}