package com.javaTest.Study403;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("array");
        System.out.println(arrayList);
        for (int x=0; x<arrayList.size(); x++){
            System.out.println(arrayList.get(x));
        }
//        System.out.println(arrayList.r);
    }
}
