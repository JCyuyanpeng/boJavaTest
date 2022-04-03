package com.javaTest.Study402;

import java.util.ArrayList;

public class ArrayListAgainDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        System.out.println(arrayList);
        arrayList.add(1,"java");
//        System.out.println(arrayList.remove("hello"));
//        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.set(1,"java new"));
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
    }
}
