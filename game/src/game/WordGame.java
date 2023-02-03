package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<String> wordList = new ArrayList<>();
		String startLetter = "";

		System.out.println("끝말잇기 시작");
		while (true) {
			if (startLetter.equals("")) {
				System.out.println("시작 단어를 입력하세요.");
			} else {
				System.out.println("\"" + startLetter + "\"로 시작하는 단어를 입력하세요/");
			}

			String word = scan.nextLine();
			word = word.trim(); // 글자 사이사이 띄어쓰기는 다 유지해줌
			word = word.replace(" ", ""); // 띄어쓰기 자체를 다 없애버림

			if (word.length() < 3) {
				if (!word.startsWith(startLetter) || word.equals("포기")) {
					System.out.println("\"" + word + "\"를 입력했습니다.");
					System.out.println("게임이 종료됩니다.");
					break;
				}
				System.out.println("\"" + word + "\"는 " + word.length() + "글자입니다. 3글자 이상 단어를 입력하세요.");
			} else if (!word.startsWith(startLetter) || word.equals("포기")) {
				System.out.println("\"" + word + "\" 를 입력했습니다.");
				System.out.println("게임이 종료됩니다.");
				break;
			} else {
				wordList.add(word);
				startLetter = word.substring(word.length() - 1); // 제일 마지막글자 하나를 가져온다.
			}
		}
		System.out.println("입력한 단어들은");
		for (String word : wordList) {
			System.out.println(word);
		}
		System.out.println("입니다.");
	}

}
