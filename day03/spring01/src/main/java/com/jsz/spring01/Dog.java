package com.jsz.spring01;

// interface는 implements 키워드를 사용해야 함
public class Dog implements Animal{
    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void cry() {
        System.out.println(this.name+"이(가) 웁니다 멍");
    }
}
