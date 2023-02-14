package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
/**
 * Java 총정리
 * @author User
 *
 */
public class Task2 {

	public static void main(String[] args) {
		
		// List 만들기
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		// 1 ~ 45 사이의 랜덤 값 가져오기
		Random random = new Random();
		List <Integer> lotto = new ArrayList<>();
		
		int randomNumber = random.nextInt(45) + 1;
		if (!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45) + 1;
		if (!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45) + 1;
		if (!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45) + 1;
		if (!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45) + 1;
		if (!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45) + 1;
		if (!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		
		
		if (lotto.size() > 0) {
			System.out.println(lotto.get(0));	
		}
		if (lotto.size() > 1) {
			System.out.println(lotto.get(1));	
		}
		if (lotto.size() > 2) {
			System.out.println(lotto.get(2));	
		}
		if (lotto.size() > 3) {
			System.out.println(lotto.get(3));	
		}
		if (lotto.size() > 4) {
			System.out.println(lotto.get(4));	
		}
		if (lotto.size() > 5) {
			System.out.println(lotto.get(5));	
		}
		
		
		// Map
		Map<String, Integer> scores = new HashMap<>();
		scores.put("subject1", 100);
		scores.put("subject2", 85);
		scores.put("subject3", 70);
		scores.put("subject4", 50);
		
		scores.put("subject3", 100);
		
		System.out.println(scores.size());
		scores.clear();
		
		System.out.println(scores);
		
		
	}
}
