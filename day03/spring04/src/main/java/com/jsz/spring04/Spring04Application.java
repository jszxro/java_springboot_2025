package com.jsz.spring04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);

		// 문자열, 시간타입 핸들링
		String string1 = "Hello";
		System.out.println(string1);

		String string2 = new String("Hi");
		System.out.println(string2);

		System.out.println(string1 == string2); // 둘이 같은 주소를 쓰는 변수인지 질문
		System.out.println(string1.equals(string2)); // 둘이 가지고 있는 데이터가 같은지

		String string3 = string2; // stirng2번의 주소를 할당

		System.out.println(string2 == string3);
		System.out.println(string2.equals(string3));

		// 문자열 메서드 사용
		String carstr = "avante, ionic, x3";
		String[] cars = carstr.split(",");
		for (String car:cars) {
			System.out.println(car.trim());
		}

		for (String car:cars) {
			System.out.println(car.toUpperCase());
		}

		String caresuit1 = carstr.replace(", ", "/");
		System.out.println(caresuit1);
		String caresuit2 = carstr.replace(',', '/'); // Java에서 ''는 Char(글자 한자)
		System.out.println(caresuit2);

		char[] charLst = string1.toCharArray();
		for (char oneChar : charLst) {
			System.out.println(oneChar);
		}
		System.out.println(caresuit1.indexOf("io")); // avante/ionic/x3 io의 위치는 7
		System.out.println(caresuit1.lastIndexOf("n")); // 9
		System.out.println(caresuit1.length()); // 15
	}

}
