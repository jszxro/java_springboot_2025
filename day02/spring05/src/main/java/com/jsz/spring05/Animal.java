package com.jsz.spring05;

public class Animal { // public 어디서든지 불러서
    public String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void cry() {
        System.out.println(this.name + "이(가) 웁니다.");
    }

}
