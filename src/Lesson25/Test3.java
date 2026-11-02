package Lesson25;

public class Test3 {
  public static void main(String[] args) {
    Employee emp1 = new Doctor();
    Employee emp2 = new Teacher();
    Employee emp3 = new Driver();
    Employee emp4 = new Employee();

    Employee [] array = {emp1, emp2, emp3, emp4};
    for(Employee e:array) {
      if (e instanceof Driver) {
        System.out.println(((Driver) e).nazvanieMashiny);
        ((Driver)e).drive();
      }
    }


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

class Doctor extends Employee implements Help_able{
  String specialization = "Hirurg";
  public void help () {
    System.out.println("Doctor helps");
  }

  void heel() {
    System.out.println("Lechit");
  }
}

class Teacher extends Employee {
  int kolichestvoUchenikov;

  void teach() {
    System.out.println("Uchit");
  }
}

class Driver extends Employee {
  String nazvanieMashiny = "Mercedes";

  void drive() {
    System.out.println("Vodit");
  }
}

interface Help_able {
  void help();
}