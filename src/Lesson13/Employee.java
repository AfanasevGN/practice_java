package Lesson13;

public class Employee {
  public static void main(String[] args) {
    int dayOfWeek = 3;

    switch (dayOfWeek) {
      case 1:
      case -22:
      case 3:
      case 4:
      case 5:
        System.out.println("Work until 18:00");
        break;
      case 6:
        System.out.println("Work until 14:00");
        break;
      case 7:
        System.out.println("Day off");
        break;
      default:
        System.out.println("No day like this");
        break;
    }
  }
}
