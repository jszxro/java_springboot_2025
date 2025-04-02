package com.jsz.spring03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring03Application {
	// 정적 메서드에서는 같은 클래스 내 일반 메서드를 호출할 수 없음
	// 정적 메서드는 같은 클래스 내 정적 메서드만 호출할 수 있음
	// 다른 클래스는 상관 없음
	// 정적 메서드는 클래스 인스턴스 생성없이(new) 바로 호출할 수 있음
	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);

		// 메서드
		sayHi();

		System.out.println("75는 짝수?" + isEven(75));

	}

	public void printHello() {
		System.out.println("Hello, Spring");
	}

	public static void sayHi() {
		System.out.println("Hi, Spring");
	}

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}

