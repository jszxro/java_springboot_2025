package com.jsz.spring04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {
   //public interface myMax { // 익명함수를 위한 인터페이스
   //int max(int a, int b);}

   public static void main(String[] args) {
      SpringApplication.run(Spring04Application.class, args);

      // 람다식
      //  1. 일반방식
      Spring04Application app = new Spring04Application();
      System.out.println(app.helloJava());

      //  2. 기존익명함수
      //System.out.println(new lambdaFunc()) {public int max(int a, int b) {return a > b ? a : b;}} . max(14, 34);

      //  3. 람다방식 !! (예시) 
      // String result = () -> {"Hello, Java!";};
      //System.out.println({() -> "Hello, Java!"});
      myFuncInterface fi = () -> {System.out.println("Hello, Java! 난 람다람쥐 호출이야 'ㅅ'!"); };
      fi.printHello();

	  maCalc calc = (x, y) -> {return x + y;};
	  int result = calx.plus(100, 55);
	  System.out.println(result);

	  List<String> avengers = Arrays.asList("IronMan", "Captain America", "SpiderMan", "Hulk", "AntMAn");

	  Collections.sort(avengers);
	  System.out.println(avengers);

	  for (String hero : avengers) {
		System.out.println(hero);
	  }
	  // 단점은 출력시 반복문 써야하고, 정렬 후 원본 순서가 사라진다는 점

   }
   
   // 일반 메서드 호출
   public String helloJava() {
      return "Hello, Java! 난 일반 호출이야 ^_^! ";
   }

   @FunctionalInterface // 함수형 인터페이스로 지칭
   public interface myFuncInterface {
      void printHello();
   }

   @FunctionalInterface
   public interface myCal {
	int plus(int x, int y);
   
	
   }
   
   
}


