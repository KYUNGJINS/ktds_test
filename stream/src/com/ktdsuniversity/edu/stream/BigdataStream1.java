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
		
		
	}
}
