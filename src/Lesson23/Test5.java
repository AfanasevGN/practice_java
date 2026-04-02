package Lesson23;

public class Test5 {
  public static void main(String[] args) {
    Employee e = new Teacher();
    // Employee emp = new Employee();
    Teacher t = new Teacher();
    System.out.println(t.salary);

    // emp.sleep();
    // t.sleep();
    // e.sleep();


  }
}

class Eda {

}

class Frukti extends Eda {

}

class Employee {
  double salary = 100;
  String name;
  int age;
  int experience;

  final public Eda eat() {
    System.out.println("Kushaet rabotnik");
    Eda e = new Eda();
    return e;
  }

  final static void sleep() {
    System.out.println("Spit rabotnik");
  }
}

class Teacher extends Employee {
  int kolichestvoUchenikov;

  String salary = "dvesti";

  // public Eda eat() {
  //   System.out.println("Kushaet uchitel");
  //   Frukti f = new Frukti();
  //   return f;
  // }

  void teach() {
    System.out.println("Uchit");
  }

  // static void sleep() {
  //   System.out.println("Spit uchitel");
  // }
}

