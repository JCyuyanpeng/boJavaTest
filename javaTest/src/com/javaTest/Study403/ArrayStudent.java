package com.javaTest.Study403;

public class ArrayStudent {

    private String name;
    private int age;
    public ArrayStudent(){}

    public ArrayStudent(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
