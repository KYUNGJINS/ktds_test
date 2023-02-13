package com.ktdsuniversity.edu.method;

public class CalC {
	
	// 파라미터의 타입이 달라짐
	public int sum(long longnumber) {
		System.out.println("long sum");
		return 0;
	}
	
	// 파라미터의 개수가 달라짐
	public int sum(int number) {
		System.out.println("int sum");
		return 0;
	}

	public int sum(int number, int numberTwo) {
		System.out.println("int int sum");
		return 0;
	}
	
	public int sum(int number, int numberTwo, int numberThree) {
		System.out.println("int int int sum");
		return 0;
	}

}
