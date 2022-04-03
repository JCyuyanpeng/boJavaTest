package com.javaTest.Study402;

import java.util.Scanner;

public class StrintTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
//        Scanner sc1 = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
}
