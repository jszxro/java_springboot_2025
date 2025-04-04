package com.jsz.spring04;

public class NewCar {
    // 멤버변수 / 속성
    String model_name;
    String company = "현대자동차";
    String color = "White";
    int realease_year;
    String fuel_type = "휘발유";

    // 생성자(클래스명과 일치)
    NewCar() {
        model_name = "아반테";
        this.company = "현대자동차";
    }
    // 메서드 오버로딩
    NewCar(String model_name, String company, int release_year) {
        this.model_name = model_name;
        this.company = company;
        this.realease_year = realease_year;
        System.out.println("인자 초기화 생성자 실행");
    }

    // 멤버메서드
    public void doAccelerate() {
        System.out.println(this.model_name + "가속");
    }

    public void doBreak() {
        System.out.println(this.model_name + "정지");
    }

    public void changeGear() {
        System.out.println(this.model_name + "기어변속");
    }

    public void turnLeft() {
        System.out.println(this.model_name + "좌회전");
    }

    public void turnRight() {
        System.out.println(this.model_name + "우회전");
    }
}
