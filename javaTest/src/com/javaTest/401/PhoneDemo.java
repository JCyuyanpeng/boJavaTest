package com.javaTest;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.price);
        System.out.println(p.brand);
        p.call();
        p.sendMessage();
    }
}
