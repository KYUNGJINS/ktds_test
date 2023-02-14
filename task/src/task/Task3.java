package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Java 총정리
 * 
 * @author User
 *
 */
public class Task3 {

	public static void main(String[] args) {

		// p.88 실습
		// 배열
		int[] average = new int[4];

		average[0] = 100;
		average[1] = 80;
		average[2] = 75;
		average[3] = 95;

		int sum = average[0] + average[1] + average[2] + average[3];

		double avg = (double) sum / 4;
		System.out.println("배열을 이용한 4가지 과목의 평균은 " + avg + "입니다.");

		// List
		List<Integer> listAverage = new ArrayList<>();

		listAverage.add(50);
		listAverage.add(70);
		listAverage.add(100);
		listAverage.add(90);

		int listSum = listAverage.get(0) + listAverage.get(1) + listAverage.get(2) + listAverage.get(3);

		double listAvg = (double) listSum / 4;
		System.out.println("List를 이용한 4가지 과목의 평균은 " + listAvg + "입니다.");

		// Map
		Map<String, Integer> mapAverage = new HashMap<>();

		mapAverage.put("mathMatics", 75);
		mapAverage.put("physics", 65);
		mapAverage.put("english", 80);
		mapAverage.put("programming", 50);

		int mapSum = mapAverage.get("mathMatics") + mapAverage.get("physics") + mapAverage.get("english")
				+ mapAverage.get("programming");

		double mapAvg = (double) mapSum / 4;
		System.out.println("Map을 이용한 4가지 과목의 평균은 " + mapAvg + "입니다.");

		// p.93 실습
		// if ~ else
		int age = 19;
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년입니다.");
		}

		// p.95 실습
		// 배열
		String grade = "";

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("학점은 " + grade + " 입니다.");

		// List
		if (listAvg >= 90) {
			System.out.println("학점은 A 입니다.");
		} else if (listAvg >= 80) {
			System.out.println("학점은 B 입니다.");
		} else if (listAvg >= 70) {
			System.out.println("학점은 C 입니다.");
		} else if (listAvg >= 60) {
			System.out.println("학점은 D 입니다.");
		} else {
			System.out.println("학점은 F 입니다.");

			// Map
		}
		if (mapAvg >= 90) {
			System.out.println("학점은 A 입니다.");
		} else if (mapAvg >= 80) {
			System.out.println("학점은 B 입니다.");
		} else if (mapAvg >= 70) {
			System.out.println("학점은 C 입니다.");
		} else if (mapAvg >= 60) {
			System.out.println("학점은 D 입니다.");
		} else {
			System.out.println("학점은 F 입니다.");
		}

		// p.97 실습
		// 논리연산자 문법
		double avg1 = 85.6;
		int dayoff = 2;

		boolean result = (avg1 > 90) && (dayoff == 0);
		if (result) {
			System.out.println("A");
		}

		// 영화 한편 18,000원 - 나이 제한이 12세인 영화 볼 수 있는지 없는지
		int expenses = 18_000;
		age = 28;

		boolean isPossible = (expenses >= 18_000) && (age >= 12);
		if (isPossible) {
			System.out.println("Y");
		}

		// p.107 실습
		int avg2 = 63;
		// 학점을 일단 F로 정해버리고 if구문에 걸리지 않으면 F로 나오는 것
		String grade1 = "F";

		if (avg2 >= 95 && avg2 < 100) {
			grade1 = "A+";
		} else if (avg2 >= 90 && avg2 <= 94) {
			grade1 = "A";
		} else if (avg2 >= 85 && avg2 <= 89) {
			grade1 = "B+";
		} else if (avg2 >= 80 && avg2 <= 84) {
			grade1 = "B";
		} else if (avg2 >= 70 && avg2 <= 79) {
			grade1 = "C";
		} else if (avg2 >= 60 && avg2 <= 69) {
			grade1 = "D";
		}

		System.out.println(grade1);

		// p.110 실습

		int age1 = 28;

		for (int i = 0; i < 3; i++) {
			if (age1 >= 19) {

				System.out.println("성인입니다.");
			} else {
				System.out.println("미성년입니다.");
			}
		}

		// p.120 2번 실습
		int[] scores = new int[4];
		scores[0] = 50;
		scores[1] = 70;
		scores[2] = 83;
		scores[3] = 77;

		int sum1 = 0;

		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[ " + i + " ]: " + scores[i]);
			sum1 = sum1 + scores[i];
		}

		double avg3 = (double) sum1 / 4;

		if (avg3 >= 95 && avg2 < 100) {
			System.out.println("A+");
		} else if (avg3 >= 90 && avg2 <= 94) {
			System.out.println("A");
		} else if (avg3 >= 85 && avg2 <= 89) {
			System.out.println("B+");
		} else if (avg3 >= 80 && avg2 <= 84) {
			System.out.println("B");
		} else if (avg3 >= 70 && avg2 <= 79) {
			System.out.println("C");
		} else if (avg3 >= 60 && avg2 <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		// 0부터 99까지 구하기 -> 5의 배수 구하기 -> 0제외하기
		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0 && i > 0) {
				System.out.println(i);
			}
		}

		// 0부터 99까지 반복, 2의 배수이면 "짝수입니다." 출력, 2의 배수가 아니면 "홀수입니다." 출력
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}

		// 정수형 배열 만들기(인덱스의 개수는 50개)
		int[] index = new int[50];
		Random random = new Random();
		
		for (int i = 0; i < index.length; i++) { // 할당하는 for
			index[i] = random.nextInt(50) + 1;
		}
		for (int i = 0; i < index.length; i++) { // 출력하는 for
			if (index[i] % 3 == 0 && index[i] > 0) {
				System.out.println(index[i]);
			}

		}
	}
}
