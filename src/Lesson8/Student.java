package Lesson8;

import java.sql.SQLOutput;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student " + name + " with number " + count + " created");
    }

    public static void showCount() {
        System.out.println("total amount of students " + count);
    }

    public void showInfo() {
        System.out.println("Welcome to the Student class!!!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        Student st2 = new Student("Vasiliy", 1);
        st2.a++;
        count++;
    }

    public static void main(String[] args) {
        abcd();
        Student s3 = new Student("Zhora", 4);
        s3.abc();
    }
}
