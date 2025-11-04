package Lesson13;

public class Test1 {

}

class Student {
  int grade;

  Student(int grade) {
    this.grade = grade;
  }

  public static void main(String[] args) {
    Student st1 = new Student(6);
    switch (st1.grade) {
      case 2:
        System.out.println("Student dvoeshnik");
        break;
      case 3:
        System.out.println("Student troeshik");
        break;
      case 4:
        System.out.println("Student udarnik");
        break;
      case 5:
        System.out.println("Student goat");
        break;
      default:
        System.out.println("Ocenka neverna");
    }
  }
}