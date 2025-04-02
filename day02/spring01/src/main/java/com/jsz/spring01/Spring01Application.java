package com.jsz.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		// while문, 조건에 맞지 않으면 한 번도 실행 안 됨
		int num = 10;

		while (num >= 0){
			System.out.println(num);
			num--;
		}
		
		System.out.println("while문 종료");

		// do-while문, 조건에 맞지 않아도 한 번은 실행이 됨 
		int cnt = 1;
		do {
			System.out.println(cnt);
			cnt++;
		} while (cnt < 10);

		System.out.println("do-while문 종료");

		// break, continue
		num = 1;
		while (num < 11) {
			if (num % 2 == 0) {
				num++;
				break;
			}
			System.out.println(num);
			num++;
		}
		System.out.println("break, continue 종료");
	}

}
