package com.ktdsuniversity.edu.exceptions;

public class ArrayIndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {

		String[] nameArr = new String[3];
		nameArr[0] = "조태용";
		nameArr[1] = "정덕수";
		nameArr[2] = "이나연";

		String name = nameArr[0];
		System.out.println(name);
		name = nameArr[1];
		System.out.println(name);
		name = nameArr[2];
		System.out.println(name);

		if (nameArr.length > 3) {
			name = nameArr[3];
			System.out.println(name);
		}

		String string = "창업 기업은 한 번쯤 자금 부족에 시달리는 등 큰 시행착오를 겪는 ‘데스밸리(죽음의 계곡)’를 지납니다. "
				+ "이 시기를 견디지 못하면 아무리 좋은 기술력, 서비스를 갖고 있다고 해도 생존하기 어려운데요. "
				+ "잘 알려지기만 하면 시장에게 좋은 반응을 얻을 수 있는 중소기업이 죽음의 계곡에 빠지게 둘 순 없습니다. " + "이들이 세상을 바꿀 수 있도록 응원합니다.\r\n";
		String[] wordArray = string.split(" ");
		if (wordArray.length > 50) {
			String word = wordArray[50];
			System.out.println(word);
		}

		try {
			String word = wordArray[50];
			System.out.println(word);
		} catch (ArrayIndexOutOfBoundsException AOOE) {
			System.out.println("그런 인덱스는 없습니다.");

		}
	}

}
