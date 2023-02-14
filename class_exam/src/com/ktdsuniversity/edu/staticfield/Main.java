package com.ktdsuniversity.edu.staticfield;

public class Main {
	
	private int number = 0;
	
	public static void main(String[] args) {
		
		Main m = new Main();
		System.out.println(m.number);
		
		// static을 사용하면 '클래스명.무엇' 으로 바로 접근할 수 있게 된다.
		int num = StaticTest.NUM;
		String str = StaticTest.STR;
		
		System.out.println(num);
		System.out.println(str);
		
		StaticTest.printHello();
		StaticTest.printHello("홍길동");
		
	}
	
}
