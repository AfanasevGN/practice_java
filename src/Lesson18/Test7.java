package Lesson18;

public class Test7 {
  public static void main(String[] args) {

    char [] array = {'p','r','i','v','e','t'};
    StringBuilder sb = new StringBuilder("Hello World");
    sb.insert(2, array, 1 , 3);
    System.out.println(sb);
  }
}
