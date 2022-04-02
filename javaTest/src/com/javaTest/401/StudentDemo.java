package com.javaTest;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "jack";
        s.age = 20;
//        System.out.println(s.name + "," + s.age);
//        s.study();
//        s.sport();
//        System.out.println("-----------------");
//        Student s1 = new Student();
//        s1.name = "tom";
//        s1.age = 22;
//        System.out.println(s1.name + ", " + s1.age);
//        s1.study();
//        s1.sport();
//        System.out.println("-------");
//        System.out.println(s.name + ", " + s.age);
        System.out.println(s.name + ", " + s.age);
        Student s2 = s;
        s2.name = "tom";
        s2.age = 30;
        System.out.println("---------------");
        System.out.println(s2.name + ", " + s2.age);
        System.out.println("---------------");
        System.out.println(s.name + ", " + s.age);
    }
}
