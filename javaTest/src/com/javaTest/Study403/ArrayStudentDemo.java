package com.javaTest.Study403;

import java.util.ArrayList;

public class ArrayStudentDemo {
    public static void main(String[] args) {
        ArrayList<ArrayStudent> arrayList = new ArrayList<ArrayStudent>();
        ArrayStudent s1 = new ArrayStudent("tom",29);
        ArrayStudent s2 = new ArrayStudent("jack", 30);
        ArrayStudent s3 = new ArrayStudent("alex",40);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
//        System.out.println(arrayList);
        for (int x=0;x<arrayList.size();x++){
//            System.out.println(arrayList.get(x));
            ArrayStudent s = arrayList.get(x);
//            s = s
            System.out.println(s.getName() + ", "+ s.getAge());
        }
    }
}
