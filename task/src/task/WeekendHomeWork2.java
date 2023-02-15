package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 2월 10일 금요일 과제
 * 
 * @author User
 *
 */
public class WeekendHomeWork2 {

	public static void main(String[] args) {

//		1. 랜덤 숫자 50개를 List에 넣고 그 중 가장 큰 숫자 하나를 출력한다.
//		2. 랜덤 숫자 50개를 List에 넣고 그 중 가장 작은 숫자 하나를 출력한다.
		List<Integer> list = new ArrayList<>();
		Random random = new Random();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 50; i++) {

			int randomNumber = random.nextInt(50) + 1;
			list.add(randomNumber);

			if (list.get(i) >= max) {
				max = list.get(i);
			}

			if (list.get(i) <= min) {
				min = list.get(i);
			}
		}
		System.out.println("최대값은 " + max + "입니다.");
		System.out.println("최소값은 " + min + "입니다.");

//		3. 랜덤 숫자 50개를 List에 넣고 그 중 평균 값(정수형)과 같은 숫자 하나를 출력한다. 없으면 0 을 출력한다.
		int sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		int avg = sum / list.size();
		if (list.contains(avg)) {
			System.out.println("평균값은 " + avg + "입니다.");
		} else {
			System.out.println("0");
		}

	}

}
