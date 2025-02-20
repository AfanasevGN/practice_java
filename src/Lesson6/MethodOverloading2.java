package Lesson6;

public class MethodOverloading2 {
    public int sum(int i1, int i2) {
        return i1 + i2;
    }

    public String sum(String s1, String s2) {
        return s1 + s2;
    }

    protected void sum(int a, String b){
        System.out.println("a yo metro dont trust you i will shoot you");
    }
}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();
        int a = mO2.sum(1, 2);
        System.out.println(a);

        String s = mO2.sum("hello, ", "world!!");
        System.out.println(s);

        mO2.sum(10,"Sup buddy");
    }
}
