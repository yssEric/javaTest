package com.hk.entity;

/**
 * @program: javaTest
 * @description: 数据模型类
 * @author: Mr.Yi
 * @create: 2018-11-30 15:16
 **/
public class dataModel {
    private String age;
    private String name;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "dataModel{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

