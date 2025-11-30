package Lesson14;

public class Test6 {
  public void time() {
    HOURS:
    for (int hour = 0; hour <= 23; hour++) {
      MINUTES:
      for (int minute = 0; minute <= 59; minute++) {
        SECONDS:
        for (int second = 0; second <= 59; second++) {
          System.out.println(hour + ":" + minute + ":" + second);
        }
      }
    }
  }

  public static void main(String[] args) {
    Test6 test = new Test6();
    test.time();
  }
}
