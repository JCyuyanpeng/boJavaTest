package com.javaTest.Study402;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sbt = new StringBuilder();
        sbt.append(1);
        sbt.append("hello");
        sbt.append(12.9);
        System.out.println(sbt);
        sbt.reverse();
        System.out.println(sbt);
        sbt.toString();
        System.out.println(sbt);
    }
}
