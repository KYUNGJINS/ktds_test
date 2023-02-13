package com.ktdsuniversity.edu.method;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		CalC calC = new CalC();
		// int sum
		calC.sum(0);
		// long sum
		calC.sum(0L);
		// int int sum
		calC.sum(0, 0);
		// int int int sum
		calC.sum(0, 0, 0);
		
		Welcome welcome = new Welcome();
		String greeting = welcome.greeting();
		System.out.println(greeting);
		
		greeting = welcome.greeting("장민창");
		System.out.println(greeting);
		
		greeting = welcome.greeting("장민창", "안녕?");
		System.out.println(greeting);
		
		greeting = welcome.greeting("장민창", "조태용", "이동학");
		System.out.println(greeting);
		
		// 배열 파라미터 Case 1
		greeting = welcome.greetings(new String[] {"장민창", "조태용", "이동학"});
		System.out.println(greeting);
		
		
	}
	
}
