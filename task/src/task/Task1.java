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
public class Task1 {

	public static void main(String[] args) {

//		**** Stream 문제 아닙니다. ****
//
//		1. 랜덤 숫자 50개를 List에 넣고 그 중 가장 큰 숫자 하나를 출력한다.
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		int randomNumber;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 50; i++) {
		randomNumber = random.nextInt(50) +1;
		if (list.get(i) >= max) {
			max = list.get(i);
		System.out.println(list.get(i));
		}
			
		
	}
	}
}
	
//		2. 랜덤 숫자 50개를 List에 넣고 그 중 가장 작은 숫자 하나를 출력한다.
//		3. 랜덤 숫자 50개를 List에 넣고 그 중 평균 값(정수형)과 같은 숫자 하나를 출력한다. 없으면 0 을 출력한다.
//
//		**** Stream 문제 아닙니다. ****

