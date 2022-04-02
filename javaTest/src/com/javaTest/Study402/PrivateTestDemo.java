package com.javaTest.Study402;

public class PrivateTestDemo {
    public static void main(String[] args) {
        PrivateTest p = new PrivateTest();
        p.setName("jack");
        p.setAge(30);
        p.show();
        System.out.println("------");
        System.out.println(p.getName() + "....." + p.getAge());
    }
}
