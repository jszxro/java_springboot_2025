package com.jsz.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		// 인터페이스 실습]
		Dog ppoppy = new Dog("쿠키", 12);
		Cat kitty = new Cat("키티", 8);

		ppoppy.cry();
		kitty.cry();
	}

}
