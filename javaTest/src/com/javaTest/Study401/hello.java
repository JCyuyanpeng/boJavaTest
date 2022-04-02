package com.javaTest;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("please input int");
        int new_number = number(10);
        System.out.println(new_number);
    }
    public static void helloWorld(){
        System.out.println("new prod");
    }
    public static int number(int x){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (x > num){
            return x;
        }
        return num;
    }
}
