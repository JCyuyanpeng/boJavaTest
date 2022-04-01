package com.javaTest;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "xiao ming";
        s.age = 20;
        System.out.println(s.name + "," + s.age);
        s.study();
        s.sport();
    }
}
