package task;

import java.util.ArrayList;
import java.util.List;

/**
 * 자바 복습 문제 63개
 * @author User
 *
 */
public class JavaSummary {

	public static void main(String[] args) {
		
//1. 정수형 변수 number를 생성하고 7을 할당한 후 출력하기
		int number = 7;
		System.out.println(number);
		
//2. 정수형 변수 empty를 생성하고 아무것도 할당하지 않고 출력하기
		int empty;
		//System.out.println(empty);
		
//3. 정수형 변수 result를 생성하고 7과 7을 더한 후 출력하기
		int result = 7 + 7;
		System.out.println(result);
		
//4. 정수형 변수 overflow를 생성하고 Integer.MAX_VALUE를 할당하고 출력하기
		int overflow = Integer.MAX_VALUE;
		System.out.println(overflow);
		
//5. 정수형 변수 overflow에 1을 더해 할당하고 출력하기
		overflow += 1;
		System.out.println(overflow);
		
//6. overflow 의 값이 이상하게 출력된 이유를 옆 사람에게 설명하기
		System.out.println("int의 최대값이 2147483647이기 때문에 이를 넘어가면 음수로 바뀐다.");
		
//7. 6의 결과를 정상적인 값으로 출력되도록 변경해보기
		long longOverflow = 2147483647L;
		System.out.println(longOverflow);
		
//8. overflow에 Integer.MIN_VALUE를 할당하고 출력하기
		overflow = Integer.MIN_VALUE;
		System.out.println(overflow);
		
//9. 정수형 변수 overflow에 1을 빼서 할당하고 출력하기
		overflow -= 1;
		System.out.println(overflow);
		
//10. overflow 의 값이 이상하게 출력된 이유를 옆 사람에게 설명하기
//11. 10의 결과를 정상적인 값으로 출력되도록 변경해보기
//12. 정수형 변수 divResult를 생성하고 10/3 의 결과를 할당해 출력하기
		int divResult = 10 / 3;
		System.out.println(divResult);
		
//13. 소수점 이하 자리수가 안나오는 이유를 옆 사람에게 설명하기
		System.out.println("정수를 정수로 나누면 정수의 값이 나오기 때문에"
				+ "실수의 값을 얻고싶다면 명시적 형 변환을 해줘야 한다.");
		
//14. divResult의 값이 소수점이 나오도록 변경해보기
		double doubleDivResult = (double) 10 / 3;
		System.out.println(doubleDivResult);
		
//15. 불린형 변수 isEquals를 생성하고 1 == 1을 할당하고 출력하기
		boolean isEquals = 1 == 1;
		System.out.println(isEquals);
		
//16. isEquals에 1 != 1을 할당하고 출력하기
		isEquals = 1 != 1;
		System.out.println(isEquals);
		
//17. 불린형 변수 logicalAnd를 생성하고 true && true를 할당하고 출력하기
		boolean logicalAnd = true && true;
		System.out.println(logicalAnd);
		
//18. logicalAnd에 true && false를 할당하고 출력하기
		logicalAnd = true && false;
		System.out.println(logicalAnd);
		
//19. logicalAnd에 false && true를 할당하고 출력하기
		logicalAnd = false && true;
		System.out.println(logicalAnd);
		
//20. logicalAnd에 false && false 를 할당하고 출력하기
		logicalAnd = false && false;
		System.out.println(logicalAnd);
		
//21. 불린형 변수 logicalOr를 생성하고 true || true를 할당하고 출력하기
		boolean logicalOr = true || true;
		System.out.println(logicalOr);
		
//22. 불린형 변수 logicalOr를 생성하고 true || false를 할당하고 출력하기
		logicalOr = true || false;
		System.out.println(logicalOr);
		
//23. 불린형 변수 logicalOr를 생성하고 false || true를 할당하고 출력하기
		logicalOr = false || true;
		System.out.println(logicalOr);
		
//24. 불린형 변수 logicalOr를 생성하고 false || false를 할당하고 출력하기
		logicalOr = false || false;
		System.out.println(logicalOr);
		
//25. 5개의 인덱스를 가진 정수형 배열변수 scores를 생성하기
		int [] scores = new int[5];
		
//26. 각 인덱스에 임의의 값을 할당하기
		scores[0] = 60;
		scores[1] = 70;
		scores[2] = 80;
		scores[3] = 90;
		scores[4] = 100;
		
//27. 각 인덱스의 값을 모두 출력하기
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
//28. 각 인덱스의 값을 반복문을 이용해 출력하기
//29. 각 인덱스의 값을 foreach문을 이용해 출력하기
//30. 각 인덱스의 값을 모두 더해 출력하기
		System.out.println(scores[0] + scores[1] + scores[2] + scores[3] + scores[4]);
		
//31. 각 인덱스의 값을 반복문을 이용해 모두 더한 후 출력하기
//32. 각 인덱스의 값을 foreach를 이용해 모두 더한 후 출력하기
//33. 각 인덱스의 값을 반복문으로 출력하기. 단, 값이 70 이하인 경우 출력하지 않도록 하기
//33. 각 인덱스의 값을 반복문으로 출력하기. 단, 값이 30보다 크고 70이하 인 경우만 출력하기
//35. List 정수형 변수 scoreList를 생성하기
		List <Integer> scoreList = new ArrayList<>();
		
//36. scoreList에 임의의 값 10개 할당하기
		scoreList.add(1);
		scoreList.add(2);
		scoreList.add(3);
		scoreList.add(4);
		scoreList.add(5);
		scoreList.add(6);
		scoreList.add(7);
		scoreList.add(8);
		scoreList.add(9);
		scoreList.add(10);
		
//37. 각 인덱스의 값을 모두 출력하기
		System.out.println(scoreList.get(0));
		System.out.println(scoreList.get(1));
		System.out.println(scoreList.get(2));
		System.out.println(scoreList.get(3));
		System.out.println(scoreList.get(4));
		System.out.println(scoreList.get(5));
		System.out.println(scoreList.get(6));
		System.out.println(scoreList.get(7));
		System.out.println(scoreList.get(8));
		System.out.println(scoreList.get(9));
		
//38. 각 인덱스의 값을 반복문을 이용해 출력하기
//39. 각 인덱스의 값을 foreach를 이용해 출력하기
//40. 각 인덱스의 값을 모두 더해 출력하기
		System.out.println(scoreList.get(0) + scoreList.get(1)
		+ scoreList.get(2) + scoreList.get(3) + scoreList.get(4)
		+ scoreList.get(5) + scoreList.get(6) + scoreList.get(7)
		+ scoreList.get(8) + scoreList.get(9));
		
//41. 각 인덱스의 값을 반복문을 이용해 모두 더한 후 출력하기
//42. 각 인덱스의 값을 foreach를 이용해 모두 더한 후 출력하기
//43. 각 인덱스의 값을 반복문으로 출력하기. 단 값이 50 이하인 경우만 출력하기
//44. 각 인덱스의 값을 반복문으로 출력하기. 단 값이 10 이상 30이하인 경우만 출력하기
//45. "안녕하세요" 를 출력하는 printHello 메소드를 작성하고 실행하기
//46. 문자열 변수 name을 입력받아 "name님 안녕하세요" 를 출력하는 printHello 메소드를 작성하고 실행하기
		String name = "유경진";
		System.out.println(name + "님 안녕하세요");
		
//47. 정수형 변수 두 개를 입력받아 각 값을 곱하여 출력하는 multiplyNumbers 메소드를 작성하고 실행하기
		int a = 3;
		int b = 6;
		int c = 9;
		
		int multiplyNumbers = a * b * c;
		System.out.println(multiplyNumbers);
		
//48. 정수형 변수 세 개를 입력받아 각 값을 더하여 출력하는 plusNumbers 메소드를 작성하고 실행하기
		int d = 532;
		int e = 412;
		int f = 767;
		
		int plusNumbers = d + e + f;
		System.out.println(plusNumbers);
		
//49. 정수형 변수 한 개를 입력받고 값이 음수면 양수로, 양수면 음수로 변환하여 반환하는 convertSymbol 메소드를 작성하고 실행하기
//50. 정수형 변수 두 개를 입력받아 뺀 후 결과가 음수면 양수로, 양수면 음수로 변환하여 반환하는 convertSymbol 메소드를 작성하고 실행하기
//51. 문자열 변수 하나를 입력받아 문자열의 길이를 반환하는 getLength 메소드를 작성하고 실행하기
		String getlength = "AND에서는 false가 먼저 나올 수 있는 것을 앞에 붙여버리면 연산이 조금 더 빨라진다.";
		System.out.println(getlength.length());
		
//52. 문자열 변수 두 개를 입력받아 각 문자열을 더하여 반환하는 plusStrings 메소드를 작성하고 실행하기
		String string1 = "안녕하십니까,";
		String string2 = " 반갑습니다.";	
		
		String plusString = string1 + string2;
		System.out.println(plusString);
		
//53. 문자열 변수 세 대를 입력받아 길이가 가장 긴 문자열만 반환하는 getLongText 메소드를 작성하고 실행하기
		String[] longText = new String[3];
		
		longText[0] = "인스턴스 내에 값이 있는지 물어볼 때에는 반드시 null체크를 먼저 한다.";
		longText[1] = "그러지 않으면 NullPointerException 발생";
		longText[2] = "레퍼런스 타입의 비교: 두 개의 메모리가 같은 것인지 물어보는 것임";
		
//54. 문자열 변수 하나와 정수형 변수 두 개를 입력받아 입력받은 두 숫자만큼 문자열을 잘라 반환하는 getSubstring메소드를 작성하고 실행하기
		String string3 = ".equalsIgnoreCase(): 대/소문자 구분하지 않고 같은지 다른지 구분하는 문법";
		
		int numberOne = 5;
		int numberTwo = 13;
		
		System.out.println(string3.substring(numberOne, numberTwo));
		
//55. 문자열 변수 두 개를 입력받아 첫 번째 문자열에서 두 번째 문자열이 포함되어있는지를 반환하는 isContains메소스를 작성하고 실행하기
		String string4 = "배열이나 인덱스는 0부터 시작하기 때문에, 일단 먼저 무조건 0으로 초기화 해야 함";
		String string5 = "배열";
		
		boolean isContains = string4.contains(string5);
		System.out.println(isContains);
		
//56. 문자열 변수 세 개를 입력받아 첫 번째 문자열에서 두 번째 문자열을 세 번째 문자열로 교체하여 반환하는 getReplaced 메소드를 작성하고 실행하기
		String string6 = "아리아나 그란데";
		String string7 = "그란데 사이즈";
		String string8 = "   ";
		
		String getReplaced = string6.replace(string7, string8);
		System.out.println(getReplaced);
		
//57. 여러 개의 상품(상품명, 가격)을 가지는 클래스를 만들고 "상품명 | 가격" 형태로 반환하는 toString 메소드를 작성하고 실행하기
//58. 여러 개의 상품(상품명, 가격)을 가지는 클래스를 만들고 "상품명"을 입력하면 재고 하나를 제거하는 removeOne(상품명) 메소드를 작성하고 실행하기
//59. 여러 개의 상품(상품명, 가격)과 금액을 가지는 클래스를 만들고 "상품명"을 입력하면 재고하나를 제거하고 금액을 상품가격만큼 증가시키는 order(상품명) 메소드를 작성하고 실행하기
//60. 여러 개의 상품(상품명, 가격)과 금액을 가지는 클래스를 만들고 모든 상품이 제거될 때까지 무한 반복시키는 orderAll 메소드를 작성하고 실행하기
//61. 여러 개의 상품(상품명, 가격)과 금액을 가지는 클래스를 만들고 상품을 추가하는 addProduct(상품)를 작성하고 실행하기
//62. 여러 개의 상품(상품명, 가격)과 금액을 가지는 클래스를 만들고 상품을 추가하면 상품이 개수만큼 추가되고 금액이 가격만큼 빠지는 addProduct(상품, 개수)를 작성하고 실행하기
//63. 도서 관리 프로그램 만들기
//		 - 도서
//		     - 도서 명
//		     - 저자
//		     - 금액
//		     - ISBN
//		     - 출판사
//		 - 도서 관리 기능
//		     - 대출
//		     - 반납
//		     - 입고
	}
	
}
