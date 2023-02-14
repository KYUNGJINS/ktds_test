package com.ktdsuniversity.edu.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {
		String string = "인터페이스를 구현할 때는 클래스 이름 옆에 'implements + 인터페이스 이름'을 쓴다.\r\n" + " 그리고 구현한 변수 위에 @Override를 써주어야 함";
		List<String> wordList = new ArrayList<>();
		wordList.addAll(Arrays.asList(string.split(" ")));
		
		// 오류 찾는 방법①
		if (wordList.size() > 50) {
			String word = wordList.get(50);
			System.out.println(word);
		}
		
		// 오류 찾는 방법②
		try {
			String word = wordList.get(50);
			System.out.println(word);
		}
		catch(IndexOutOfBoundsException IOOBE) {
			System.out.println("그런 인덱스는 없습니다.");
		}

		String word = wordList.get(50);
		System.out.println(word);

	}

}
