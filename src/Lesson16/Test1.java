package Lesson16;

public class Test1 {
  public static void main(String[] args) {
    String s1 = new String("abcdefgabc");

    int a = s1.length();
    System.out.println(a);

    char c1 = s1.charAt(3);
    System.out.println(c1);

    int i1 = s1.indexOf('t');
    System.out.println(i1);

    int i2 = s1.indexOf("vet");
    System.out.println(i2);

    int i3 = s1.indexOf("S");
    System.out.println(i3);

    int i4 = s1.indexOf("a", 5);
    System.out.println(i4);

    boolean i5 = s1.startsWith("abc", 7);
    System.out.println(i5);

    boolean i6 = s1.endsWith("abc");
    System.out.println(i6);
  }
}
