package com.javaTest.Study402;

public class ThisTestDemo {
    public static void main(String[] args) {
        ThisTest t = new ThisTest();
        t.setName("jack");
        t.setAge(29);
        System.out.println(t.getName() + ", " + t.getAge());
    }
}
