package com.ktdsuniversity.edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BigdataStream1 {

	public static List<TextVO> readTextFile() {

		String filePath = "C:\\Devs\\data\\bigdata\\10K.ID.CONTENTS";
		
		try {
			List<TextVO> list = Files.readAllLines(Paths.get(filePath))
					.parallelStream()
					.map((line) -> {
						String[] strArr = line.split("\t");
						TextVO vo = new TextVO();
						vo.setKey(strArr[0].trim());
						if (strArr.length >= 2) {
							vo.setValue(strArr[1].trim());
						} 
						return vo;
					})
						.collect(Collectors.toList());
			return list;
		} 
			catch (IOException ioe) {
			return new ArrayList<>();
		}

	}

	public static void main(String[] args) {
		
		String abc = null;
		/**
		 * abc = null => true
		 * abc = "" -=> true
		 * abc = " " => false (length가 1이 나오기 때문)
		 * abc = "aaa" => false 
		 */
		boolean isEmpty1 = abc == null || abc.length() == 0;
		/**
		 * abc = null => true
		 * abc = "" -=> true
		 * abc = " " => true
		 * abc = "aaa" => false 
		 */
		boolean isEmpty2 = abc == null || abc.trim().length() == 0;
		// not false이니까 true
		boolean isEmpty3 = !(abc != null && abc.trim().length() > 0); 
		
		
		// 8-1. 10K.ID.CONTENTS 파일에서 "12370584"의 내용을 출력
		long startTime = System.currentTimeMillis();
		// 코드 작성
		Optional <String> value = readTextFile().stream()
					.filter(vo -> vo.getKey().equals("12370584"))
					.map(vo -> vo.getValue())
					.findFirst();
		System.out.print(value.orElse("없음"));
			
		System.out.println("8-1 실행시간: " + (System.currentTimeMillis() - startTime));

		// 8-2. (병렬) 10K.ID.CONTENTS 파일에서 "12370584"의 내용을 출력
		startTime = System.currentTimeMillis();
		Optional <String> value2 = readTextFile().parallelStream()
				.filter(vo -> vo.getKey().equals("12370584"))
				.map(vo -> vo.getValue())
				.findFirst();
		System.out.print(value2.orElse("없음"));
		
		System.out.println("8-1 실행시간: " + (System.currentTimeMillis() - startTime));
		
		// 9. (병렬) 10K.ID.CONTENTS 파일에서 "7670637" 에 몇 개의 단어가 있는지 출력
		Optional <Integer> value3 = readTextFile().stream()
					  .filter(vo -> vo.getKey().equals("7670637"))	
					  .map(vo -> vo.getValue().split(" ").length)
					  .findFirst();		  
		System.out.println("9. " + value3.orElse(0));
					  
		// 10. (병렬) 10K.ID.CONTENTS 파일에서 내용이 없는 "번호"는 몇 개인지 출력
		long value4 = readTextFile().stream()
					  .filter(vo -> vo.getValue() == null || vo.getValue().trim().length() == 0)
					  .count();
		System.out.println("10. " + value4);
		
		// 11. (병렬) 10K.ID.CONTENTS 파일에서 두 개의 단어로만 이루어진 "번호"는 몇 개인지 출력
		long value5 = readTextFile().stream()
					  .filter(vo -> vo.getValue() != null)
					  .filter(vo -> vo.getValue().split(" ").length == 2)
					  .map(vo -> vo.getKey())
					  .distinct()
					  .count();
		System.out.println("11. " + value5);
		
		// 12. (병렬) 10K.ID.CONTENTS 파일의 내용에서 "that" 이 포함된 글은 몇 개인지 출력
		long value6 = readTextFile().stream()
					  .filter(vo -> vo.getValue() != null)
					  .filter(vo -> vo.getValue().contains("that"))
					  .map(vo -> vo.getKey())
					  .count();
		System.out.println("12. " + value6);
		
		// 13. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 6자리인 것은 몇 개인지 출력
		long value7 = readTextFile().stream()
					  .filter(vo -> vo.getKey().length() == 6)
					  .map(vo -> vo.getKey())
					  .count();
		System.out.println("13. " + value7);
		
		// 14. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 7자리인 것은 몇 개인지 출력
		long value8 = readTextFile().stream()
					  .filter(vo -> vo.getKey().length() == 7)
					  .map(vo -> vo.getKey())
					  .count();
		System.out.println("14. " +value8);
		
		// 15. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 9로 시작하는 모든 글들의 첫 번째 단어만 출력
		// 정답(1)
		readTextFile().parallelStream()
					  .filter(vo -> vo.getKey().startsWith("9"))
					  .map(vo -> {
						  if (vo.getValue() == null) {
							  return "";
						  }
						  	  return vo.getValue().trim();
					      })
					  .map(desc -> {
						  if (desc.trim().contains(" ")) {
							  return desc.trim().split(" ")[0];
						  }
						  	  return "";
					  	  })
					  .forEach(word -> {
						  System.out.println("15-1. [" + word + "]");
					  });
		// 정답(2)
		readTextFile().parallelStream()
					  .filter(vo -> vo.getKey().startsWith("9"))
					  .map(vo -> {
						  if (vo.getValue() != null && vo.getValue().trim().length() > 0 ) {
							  return vo.getValue().trim().split(" ")[0];
						  }
						  	  return "";
					  })
					  .forEach(word -> {
						  	System.out.println("15-2. [" + word + "]");
					  });
		
		// 16. (병렬) 10K.ID.CONTENTS 파일에서 내용이 있으며 글 번호가 7로 시작하는 모든 글들의 첫 번째 단어만 출력
		readTextFile().parallelStream()
					  .filter(vo -> vo.getKey().startsWith("7"))
					  .map(vo -> {
						  if (vo.getValue() != null && vo.getValue().trim().length() > 0) {
							  return vo.getValue().trim().split(" ")[0];
						  }
						  	  return "";
					  })
					  .forEach(word2 -> {
						  System.out.println("16. [" + word2 + "]");
					  });
	}
}
