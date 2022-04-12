package com.wangxh.thisdemo;

/**
 * this关键字
 * 作用：出现在成员方法，构造器中代表对象的地址，用于指定访问当前对象的成员变量，成员方法
 * this出现在构造器，或者方法中，哪个对象调用他们，this就是代表哪个对象，其实就有点像c语言里面的指针
 */


public class Text {
    public static void main(String[] args) {
        Car c1 = new Car("法拉利",50000000);
        System.out.println(c1.getName());
        System.out.println(c1.getPrice());

        c1.go("保时捷");
        System.out.println(c1);
    }
}


/**
 * 1.this关键字的作用？
 * 代表当前对象的地址，可以用于指定访问当前对象的成员变量，方法
 */
