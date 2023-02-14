package com.ktdsuniversity.edu.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionTest {

	public static void main(String[] args) {

		// IOException은 Exeption이기 때문에 try~catch가 필수임
		try {
			Files.readAllLines(Paths.get(""));
		} catch (IOException ioe) {

		}

		System.out.println("숫자로 변환 시작");

		String str = "567";
		int number = Integer.parseInt(str);
		try {
			System.out.println("숫자로 변환 종료");
		}

		catch (NumberFormatException nfe) {
			System.out.println("숫자로 변환중에 에러가 발생했습니다." + nfe.getMessage());
		}

		System.out.println("숫자로 변환 종료");
	}

}
