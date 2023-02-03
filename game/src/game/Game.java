package game;

import java.util.Arrays;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		
		String str = "       안 녕 안 녕 안       ";
		
		// 문자열에서 좌우 공백 제거하기 .trim
		str = str.trim(); // 반드시 재할당을 해주어야만 변경이 된다.
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		// 문자열에서 텍스트 변경하기 .replace / .replaceAll
		str = str.replace(" ","_");
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		str = str.replaceAll("_", "-");
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		str = "<html>HTML 문서를 작성합니다.</html>";
		str = str.replaceAll("[가-힣]", "");
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		str = "<html>HTML 문서를 작성합니다.</html>";
		str = str.replaceAll("[^가-힣]", "");
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		str = "<html>HTML 문서를 작성합니다.</html>";
		str = str.replaceAll("[^a-zA-Z]", ""); //a-zA-Z가 아닌 것들을 공백으로 바꿔라.
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		str = "핸드폰 번호는 010-1234-5678 입니다.";
		str = str.replaceAll("[^0-9]", "");
		System.out.println("변경된 값은 [" + str + "] 입니다.");
		
		// 문자열에서 특정 단어로 시작하는지 확인하기 .indexOf
		str = "자전거";
		System.out.println("자 의 자리: " + str.indexOf("자"));
		System.out.println("전 의 자리: " + str.indexOf("전"));
		System.out.println("거 의 자리: " + str.indexOf("거"));
		System.out.println("기 의 자리: " + str.indexOf("기"));
		
		if(str.indexOf("자") == 0) {
			System.out.println("자전거는 \"자\"로 시작합니다.");			
		}
		
		// 문자열에서 특정 단어로 시작하는지 확인하기 .startsWith
		System.out.println("자전거가 \"자\"로 시작하나요? " + str.startsWith("자"));
		System.out.println("자전거가 \"전\"로 시작하나요? " + str.startsWith("전"));
		System.out.println("자전거가 \"거\"로 시작하나요? " + str.startsWith("거"));
		
		// 문자열에서 특정 단어로 끝나는지 확인하기 .lastIndexOf
		str = "기러기";
		System.out.println("기러기 \"기\"의 자리는? (indexOf) " + str.indexOf("기"));
		System.out.println("기러기 \"기\"의 자리는? (lastIndexOf) " + str.lastIndexOf("기"));
		System.out.println(str.length());
		System.out.println("기러기는 \"기\"로 끝나나요? "
						+ (str.lastIndexOf("기") == str.length() -1 ));
		
		// 문자열에서 특정 단어로 끝나는지 확인하기 .endsWith
		System.out.println("거중기는 \"거\"로 끝나나요? " + str.endsWith("거"));
		System.out.println("거중기는 \"중\"로 끝나나요? " + str.endsWith("중"));
		System.out.println("거중기는 \"기\"로 끝나나요? " + str.endsWith("기"));
		
		// 문자열에 특정 단어 및 글자가 포함되어 있는지 확인하기 .indexOf
		str = "자전거";
		System.out.println("자전거에는 \"자\"가 포함되어 있나요? " 
				+ (str.indexOf("자") > -1));
		System.out.println("자전거에는 \"전\"가 포함되어 있나요? " 
				+ (str.indexOf("전") > -1));
		System.out.println("자전거에는 \"거\"가 포함되어 있나요? " 
				+ (str.indexOf("거") > -1));
		System.out.println("자전거에는 \"기\"가 포함되어 있나요? " 
				+ (str.indexOf("기") > -1));
		
		// 문자열에 특정 단어 및 글자가 포함되어 있는지 확인하기 .contains
		System.out.println("자전거에는 \"자\"가 포함되어 있나요? "
				+ str.contains("자"));
		System.out.println("자전거에는 \"전\"가 포함되어 있나요? "
				+ str.contains("전"));
		System.out.println("자전거에는 \"거\"가 포함되어 있나요? "
				+ str.contains("거"));
		System.out.println("자전거에는 \"기\"가 포함되어 있나요? "
				+ str.contains("기"));
		
		// 문자열 자르기 .subString(p)
		str = "2023-02-03";
		String day = str.substring(8);
		System.out.println(day);
		
		String today = str.substring(5);
		today = today.replace("-","");		
		System.out.println(today);
		
		// 문자열 자르기 .subString(p,p)
		str = "2023-02-03 11:01:15";
		String year = str.substring(0, 4);
		String hour = str.substring(11, 13);
		String minute = str.substring(14, 16);
		String second = str.substring(17, 19);
		System.out.println(year);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
			
		// 문자열 특정 단어 및 기호 등으로 자르기 .split
		str = "자전거, 거중기, 기러기";
		List<String> wordList = Arrays.asList( str.split(","));
		for (String word : wordList) {
			System.out.println(word.trim());
		}
		
		str = "2023-02-22 11:22:34";
		List<String> dateList = Arrays.asList( str.split("[- :]"));
		for (String dateItem : dateList) {
			System.out.println(dateItem.trim());	
		}
		
		// subString과 indexOf를 이용해서 https와 www, google, co, kr을 추출하기
		
		// 1. https 추출
		String url = "https://www.google.co.kr";
		System.out.println(url.indexOf("://")); // "://"가 시작되는 위치를 알려줌
		
		String protocol = url.substring(0, url.indexOf("://"));
		System.out.println("Protocol: " + protocol);
		
		// 2. www 추출
		String subDomain = url.substring(url.indexOf("://") + "://".length() , url.indexOf("."));
		System.out.println("Subdomain: " + subDomain);
		
		// 3. google 추출
		String domain = url.substring(url.indexOf(subDomain) + subDomain.length() + 1 );
		domain = domain.substring(0, domain.indexOf("."));
		System.out.println("Domain: " + domain);
		
		// 4. co 추출
		String companyCode = url.substring(url.indexOf(domain) + domain.length() +1 );
		companyCode = companyCode.substring(0, companyCode.indexOf("."));
		System.out.println("Company code: " + companyCode);
		
		// 5. kr 추출
		String nationCode = url.substring(url.lastIndexOf(".") +1 );
		System.out.println("Nation code: " + nationCode);
		
		
		
	}
		
	
	
}
