package com.javaTest.Study402;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("构造方法不带参数");
    }

    public Student(String name, int age) {
        System.out.println("构造方法带参数");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + ", " + age);
    }
}
