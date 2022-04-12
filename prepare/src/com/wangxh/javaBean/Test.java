package com.wangxh.javaBean;

public class Test {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("小桦");
        u1.setSalary(100000);
        u1.setHeight(170);
        u1.setIntroduce("爱处不处~~");
        System.out.println(u1.getName());
        System.out.println(u1.getSalary());
        System.out.println(u1.getHeight());
        System.out.println(u1.getIntroduce());


    }
}
