package com.javaTest.Study402;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("jack");
        s1.setAge(20);
        s1.show();
        System.out.println(s1.getName() + ", " + s1.getAge());
        System.out.println("-----------");
        Student s2 = new Student("tom", 20);
        System.out.println(s2.getName() + ", " + s2.getAge());
        s2.show();
        System.out.println("-------");
        System.out.println("修改构造方法里面的参数");
        s2.setName("alex");
        s2.setAge(50);
        s2.show();
    }
}
