package com.ktdsuniversity.edu.lamda;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void print(Printable printable) {
		printable.print("장민창");
	}

	public static void printSumResult(Computable computable) {

		int sumResult = computable.sum(10, 30);
		System.out.println(sumResult);
	}

	public static void main(String[] args) {

		// 익명 클래스 만들기
		printSumResult(new Computable() {
			@Override
			public int sum(int numberOne, int numberTwo) {
				return numberOne + numberTwo;
			}
		});

		// 람다 함수 만들기 (위,아래 코드는 완전히 똑같은 코드임)
		printSumResult((num1, num2) -> num1 + num2);
		printSumResult((num1, num2) -> {
			return num1 + num2;
		});

		// void 타입 람다 함수로 만들기
//		print( (data) -> (data + "입니다.")); void를 리턴하는데 String을 리턴하려고 하니까 오류가 생김
		print((data) -> System.out.println(data + "입니다."));
		print(System.out::println);
		print((data) -> {
			System.out.println(data + "입니다.");
		});

		// 메소드 레퍼런스 (p.165)
		List<Integer> intList = List.of(10, 20, 30, 40, 50);
		List<Integer> intList2 = Arrays.asList(10, 20, 30, 40);

		intList.forEach(System.out::println);
		intList2.forEach(System.out::println);

	}

}
