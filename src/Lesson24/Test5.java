package Lesson24;

public class Test5 {

}

interface I1{
  default void abc(){
    System.out.println("eto metod abc");
  }

  static void def(){
    System.out.println("eto static metod def");
  }
}

interface I2 {
  static void def() {
    System.out.println("eto static method def2");
  }
}

abstract class R implements I1, I2 {
  public static void main(String[] args) {
    I1.def();
    I2.def();
  }
}













// class Z2 implements I1 {
//   public void abc() {
//     System.out.println("eto metod abc");
//   }
//   public static void main(String[] args) {
//     Z2 z = new Z2();
//     z.abc();
//     z.def();
//   }
// }
