package task;
/**
 * Java 총정리
 * @author User
 *
 */
public class Task {

	public static void main(String[] args) {
		
		// 수학,물리,영어,프로그래밍 4가지 과목의 평균을 구해보세요.
		int mathmatics = 80;
		int physics = 90;
		int english = 100;
		int programming = 75;
		
		int sum = mathmatics + physics + english + programming;
		double avg = (double) sum / 4;
		
		System.out.println("4과목의 평균은 " + avg + "점 입니다.");
		
		// 배열 만들기
		int[] array = new int[4];
		array[0] = 60;
		array[1] = 70;
		array[2] = 80;
		array[3] = 90;
		
		int total = array[0] + array[1] + array[2] + array[3];
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(total);
		
		
		
		}
	}

