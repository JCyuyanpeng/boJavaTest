package com.javaTest.Study402;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        System.out.println(arrayList);
        arrayList.add(1,"java");
        System.out.println(arrayList);
    }
}
