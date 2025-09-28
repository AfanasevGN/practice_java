package Lesson12;

public class Test10 {

  void maximum(int i1, int i2, int i3) {
    if (i1 > i2 && i1 > i3) {
      int a = 5;
      System.out.println("maximum - " + i1);
    } else if (i2 > i1 && i2 > i3) {
      int a = 10;
      System.out.println("maximum - " + i2);
    } else {
      int a = 15;
      System.out.println("maximum - " + i3);
    }
  }

  void abc() {
    String str;
    int a = 5;
    if (a >= 10) {
      str = "Hello";
    }
    if (a < 1) {
      str = "Bye";
    }
    else {
      str = "null";
    }
    System.out.println(str);
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    int maximum = (a>b) ? (a) : (b);
    System.out.println(maximum);



  }
}
