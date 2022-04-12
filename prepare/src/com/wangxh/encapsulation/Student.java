package com.wangxh.encapsulation;

public class Student {
    /**
     * 私有成员私有化，只能在本类中访问
     */
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 200)
        {
            this.age = age;
        }
        else
        {
            System.out.println("年龄不符");
        }
    }
}
