package com.ktdsuniversity.edu.constructor;

public class Main {

	public static void main(String[] args) {

		Calculator calc1 = new Calculator();
		int result = calc1.sum();
		System.out.println(result);

		Calculator calc2 = new Calculator(5, 6);
		result = calc2.sum();
		System.out.println(result);

		Doctor doctor1 = new Doctor("최신컴퓨터", "펜");
		String result2 = doctor1.examination();
		System.out.println(result2);
		// 출력 >> 의사가 최신컴퓨터와 펜으로 진찰합니다.

	}

}
