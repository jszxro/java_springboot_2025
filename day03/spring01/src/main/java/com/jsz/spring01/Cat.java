package com.jsz.spring01;

public class Cat implements Animal{
    private String name;
    private int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void cry() {
        System.out.println(this.name+"이(가) 웁니다 냥");
    }
}