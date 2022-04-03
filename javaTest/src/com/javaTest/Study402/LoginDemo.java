package com.javaTest.Study402;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        String name = "user";
        String passwd = "user1";
        for (int i=1; i<=3; i++){
            System.out.println("请输入账号和密码");
            Scanner sc = new Scanner(System.in);
            String line1 = sc.nextLine();
            String line2 = sc.nextLine();
            if (line1.equals(name) && line2.equals(passwd)){
                System.out.println("success");
                break;
            }else {
                System.out.println("已输入次数：" + i + "剩余次数：" + (3-i));
            }
        }
    }
}
