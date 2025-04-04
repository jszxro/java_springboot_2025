package com.jsz.spring03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring03Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);

		// 컬렉션 프레임워크
		// List
		List<String> lst1 = new ArrayList<>();

		lst1.add("One");
		lst1.add("Two");
		lst1.add("Three");
		lst1.add("Four");

		System.out.println(lst1);

		List<String> lst2 = new ArrayList<>();
		lst2.add("Five");
		lst2.add("Six");

		lst1.addAll(lst2);
		lst1.set(0, "Zero");

		System.out.println(lst1);
		System.out.println(lst1.get(5));

		List<Integer> lst3 = new LinkedList<>();
		lst3.add(10);
		lst3.add(20);
		lst3.add(30);	
		System.out.println(lst3);
	
		Collections.sort(lst1, Collections.reverseOrder());
		System.out.println(lst1);

		System.out.println(lst1.contains("Three"));
		System.out.println(lst1.isEmpty());
		System.out.println(lst1.size());
		lst1.remove("Four");
		// lst1.add(5);
		System.out.println(lst1);

		// lst1.clear(); 로직 중간에 함부로 쓰지 말 것, 프로그램 종료시 리스트를 비우는 것

		Vector<String> vec1 = new Vector<>(10);
		vec1.add("One");
		vec1.add("Three");
		System.out.println("벡터 크기 -> " + vec1.size());
		System.out.println("벡터 용량 -> " + vec1.capacity());

		Set<String> set1 = new HashSet<>();

		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Four");

		System.out.println(set1);

		System.out.println(set1.contains("Three"));
		System.out.println(set1.isEmpty());
		System.out.println(set1.size());
		set1.remove("Four");
		set1.add("Five");
		System.out.println(set1);
		
		// Map
		Map<String, String> phones = new HashMap<>();
		phones.put("010-6666-3333", "Galaxy S10");
		phones.put("010-6666-3555", "IPhone 16");

		System.out.println(phones);

		System.out.println(phones.get("010-6666-3333"));
		System.out.println(phones.values());
		System.out.println(phones.keySet());
		System.out.println(phones.containsKey("010-6666-3333"));
		System.out.println(phones.containsValue("Galaxy S10"));

		// 샘플 - 학생 네명의 국어, 영어, 수학, 미술, 체육 점수 합산/평균
		List<Integer> std1 = Arrays.asList(96, 100, 55, 80, 70);
		List<Integer> std2 = Arrays.asList(100, 100, 99, 98, 96);
		List<Integer> std3 = Arrays.asList(50, 50, 40, 100, 90);
		List<Integer> std4 = Arrays.asList(85, 85, 84, 86, 80);

		Map<String, List<Integer>> students = new HashMap<>();
		students.put("홍길동", std1);
		students.put("홍길순", std2);
		students.put("홍길똥", std3);
		students.put("정서영", std4);

		Scanner scan = new Scanner(System.in);
		System.out.print("#성적 조회할 학생 이름 입력 > ");
		String inName = scan.next();

		int sum = 0;
		for (int score : students.get(inName)) {
			sum += score;
		}
		System.out.println(inName + "학생의 성적 총점은 " + sum + ", 평균은 " + (sum/5));
	}

}
