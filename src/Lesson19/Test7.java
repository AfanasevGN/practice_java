package Lesson19;

public class Test7 {
  public static void main(String[] args) {
    StringBuilder sp1 = new StringBuilder("Privet");
    StringBuilder sp2 = new StringBuilder("Poka");
    StringBuilder sp3 = new StringBuilder("Okay");

    StringBuilder[] array = {sp1, sp2, sp3};
    for (StringBuilder sp : array) {
      sp.append(" Java");
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
