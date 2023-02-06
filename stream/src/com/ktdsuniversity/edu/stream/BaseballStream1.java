package com.ktdsuniversity.edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseballStream1 {

	public static List<AllStarFullVO> readAllStarFull() {

		try {
			List<AllStarFullVO> list = Files.readAllLines(Paths.get("C:\\Devs\\data\\baseball\\core\\AllStarFull.csv"))
					.stream().skip(1).map((line) -> {
						String[] strArr = line.split(",");
						AllStarFullVO vo = new AllStarFullVO();
						vo.setPlayerID(strArr[0]);
						vo.setYear(strArr[1]);
						vo.setGameNum(Integer.parseInt(strArr[2]));
						vo.setGameID(strArr[3]);
						vo.setTeamID(strArr[4]);
						vo.setLgID(strArr[5]);
						vo.setGp(Integer.parseInt(strArr[6]));
						if (strArr.length == 8) {
							vo.setStartingPos(Integer.parseInt(strArr[7]));
						} else {
							vo.setStartingPos(0);
						}
						return vo;
					}).collect(Collectors.toList());
			return list;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return new ArrayList<>();
		}

	}

	public static void main(String[] args) {
		List<AllStarFullVO> list = readAllStarFull();

		// 중간 함수는 filter, 최종 함수는 forEach
		list.stream()
			.filter((vo) -> vo.getYear().equals("1933"))
			.forEach((vo) -> {
			System.out.println(vo.getPlayerID());
			System.out.println(vo.getYear());
		});

		// 1993년에 경기를 치른 선수들만 뽑아내는 코드
		List<AllStarFullVO> playIn1933 = list.stream()
											 .filter((vo) -> vo.getYear().equals("1933"))
											 .collect(Collectors.toList());
										 System.out.println(playIn1933);
											
		// 1993년에 경기를 치른 선수들 중 첫번째 선수를 찾아내는 코드
		// 최종 함수는 findFirst
		AllStarFullVO vo = list.stream()
							   .filter((vo1) -> vo1.getYear().equals("1933"))
							   .findFirst()
							   .orElse(new AllStarFullVO());
						   System.out.println(vo.getPlayerID());

		System.out.println("--------------------------------------------------");

		// 연도에 관계없이 이름이 'f'로 시작하는 모든 데이터를 추출하는 코드
		list.stream()
			.filter((allStarVO) -> allStarVO.getPlayerID()
			.toUpperCase()
			.startsWith("F"))
			.forEach((allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
			});

		System.out.println("--------------------------------------------------");

		// 2004년도 경기에서 팀 명이 'Tex'인 것만 골라내는 코드
		list.stream()
			.filter((allStarVO) -> allStarVO.getYear().equals("2004"))
			.filter((allStarVO) -> allStarVO.getTeamID().equals("TEX"))
			.forEach((allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
				System.out.println(allStarVO.getYear());
				System.out.println(allStarVO.getTeamID());
			});

		// startingPos가 0인 것만 가져오는 코드
		list.stream()
			.filter((allStarVO) -> allStarVO.getStartingPos() == 0)
			.forEach((allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
				System.out.println(allStarVO.getStartingPos());
			});

		// GP값이 0이면서 TeamID가 NYA이어야하고 playerID에 FO가 포함되어 있는 값을 출력하는 코드
		list.stream()
			.filter((allStarVO) -> allStarVO.getGp() == 0)
			.filter((allStarVO) -> allStarVO.getTeamID().equals("NYA"))
			.filter((allStarVO) -> allStarVO.getPlayerID().toUpperCase().contains("FO"))
			.forEach((allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
			});

		System.out.println("--------------------------------------------------");

		List<String> playerNameList = list.stream()
										  .map((allStarVO) -> allStarVO.getPlayerID())
										  .distinct() // 중복 제거
										  .sorted() // 정렬
										  .collect(Collectors.toList());
					 playerNameList.forEach(System.out::println);

		System.out.println("--------------------------------------------------");

		// startingPos가 '4'인 데이터들의 playerID만 가지고와서 playerID만 추출하는 코드
		// 중복을 제거하고 정렬까지 해서 출력해보기
		List<String> playerNameList2 = list.stream()
										   .filter((allStarVO) -> allStarVO.getStartingPos() == 4)
										   .map((allStarVO) -> allStarVO.getPlayerID())
										   .distinct()
										   .sorted()
										   .collect((Collectors.toList()));
					 playerNameList2.forEach(System.out::println);

		// 연습하기
		list.stream()
			.filter((vo1) -> vo.getYear().startsWith("200"))
			.filter((vo1) -> vo.getTeamID().equals("BOS"))
			.map((vo1) -> vo.getPlayerID())
			.distinct()
			.forEach(System.out::println);

		AllStarFullVO first = list.stream()
			.filter((vo2) -> vo.getYear().equals("1937"))
			.filter((vo2) -> vo.getTeamID().equals("DET"))
			.findFirst().orElse(new AllStarFullVO());
		System.out.println(first.getPlayerID());
		
		// 2004년도 경기에서 팀 명이 'Tex'인 것만 골라내는 코드
		list.stream()
			.filter((vo3) -> vo.getYear().equals("2004"))
			.filter((vo3) -> vo.getTeamID().equals("TEX"))
			.forEach((vo3) -> {
				vo.getPlayerID();
			});

	}

}
