package com.wangxh.classdemo;

/**
 * 类成分实例
 * public class Students {
 *     1.成员变量
 * }
 * private String name;2.构造器
 * public Student() {
 *
 * }
 * public void run(){
 *     3.方法
 * }
 * static {
 *     4代码块
 * }
 * public class Heart {
 *     5.内部类
 * }
 */
public class Dog {
    private String name;
    private char sex;

    public Dog(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Dog() {

    }
}
