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

public class BaseballStream2 {

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
		
		// 1. 1933년 NYA팀의 세 번째 선수의 playerID를 출력.
		Optional <String> playerID = list.stream()
			.filter(vo -> vo.getYear().equals("1933"))
			.filter(vo -> vo.getTeamID().equals("NYA"))
			.map(vo -> vo.getPlayerID())
			.skip(2)
			.limit(1)
			.findFirst(); // 사실 limit을 걸었으니 굳이 사용할 필요는 없다.
		System.out.println(playerID.orElse("없음"));
		
			
		// 2. 1700년 NYA팀의 세 번째 선수의 playerID를 출력.
		Stream<AllStarFullVO> listStream = list.stream();
		
		// 1700년 데이터가 하나도 없기 때문에 하나도 필터링 되지 않았을 것
		Stream<AllStarFullVO> playersIn1700 = 
				listStream.filter(vo -> vo.getYear().equals("1700"));
		
		Stream<AllStarFullVO> playersInNYA =
				playersIn1700.filter(vo -> vo.getTeamID().equals("NYA"));
		
		// getPlayerID의 타입이 String이기 때문에 Stream<String>으로 바뀜
		Stream<String> playersID = playersInNYA.map(vo -> vo.getPlayerID());

		Stream<String> skipedPlayerID = playersID.skip(2);
		
		Stream<String> limitedPlayerID = skipedPlayerID.limit(1);
		
		// Optional: 데이터가 없으면 없는대로 실행하고, 있으면 있는대로 실행
		Optional<String> playerID2 = limitedPlayerID.findFirst();
		
		// Optional: Null이면 orElse를 통해 "없음"을 돌려주고, 데이터가 있으면 playerID를 달라는 뜻
		System.out.println(playerID2.orElse("없음"));
		
		
		// 3. 1934년 CHA팀에서 startingPos가 8인 선수의 playerID를 출력
		Optional <String> playerID3 = list.stream()
				.filter(vo -> vo.getYear().equals("1934"))
				.filter(vo -> vo.getTeamID().equals("CHA"))
				.filter(vo -> vo.getStartingPos() == 8)
				.map(vo -> vo.getPlayerID())
				.findFirst();
		System.out.println(playerID3.orElse("없음"));

		
		// 4. 1934년 CHA팀에서 startingPos가 8인 두 번째 선수의 playerID를 출력
		Optional <String> playerID4 = list.stream()
				.filter(vo -> vo.getYear().equals("1934"))
				.filter(vo -> vo.getTeamID().equals("CHA"))
				.filter(vo -> vo.getStartingPos() == 8)
				.map(vo -> vo.getPlayerID())
				.skip(1)
				.findFirst();
		System.out.println(playerID4.orElse("없음"));
		
		
		// 5-1. 1933년에 출전한 TeamID별 playerID를 모두 출력 (group)
		Map<String, List<AllStarFullVO>> teamMap1 = list.stream()
			.filter(vo -> vo.getYear().equals("1933"))
//			.collect(Collectors.groupingBy(vo -> vo.getTeamID())); 와 같음
			.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
			
		teamMap1.forEach((teamID, players) -> {
			
//		for (AllStarFullVO allStarFullVO : value) {
//				System.out.println("5-1. "
//								+ teamID + " > " + allStarFullVO.getPlayerID());
//			}
		players.stream()
			   .map(vo -> vo.getPlayerID())
			   .forEach((playerID5)->{
				   System.out.println("5-1. " + teamID + " > " + playerID5);
			  });
		});
		
		// 5-2. 1933년에 출전한 TeamID별 playerID의 수를 모두 출력 (group)
		Map<String, List<AllStarFullVO>> teamMap2 = list.stream()
			.filter(vo -> vo.getYear().equals("1933"))
			.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		
		teamMap2.forEach((key, value) -> {
			System.out.println("5-2. " + key + " > " + value.size());
			});
	
		
		// 6. TeamID별 출전 연도를 모두 출력 (group)
		/*
		 * 6. NYA > 1933
		 * 6. NYA > 1934
		 * 6. NYA > 1935
		 * 6. NYA > 1936
		 * 6. NYA > 1937
		 * 6. BOS > 1933
		 * 6. BOS > 1934
		 * 6. BOS > 1935
		 * 6. BOS > 1936
		 * 6. BOS > 1937
		 * ... 이렇게 출력됨 (중복제거 없이)
		 */
		Map<String, List<AllStarFullVO>> yearMap = list.stream()
			.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
			
		// teamID 안에 value라는 리스트가 들어있는 것
		yearMap.forEach((teamId, value) -> {
			
			value.stream()
				 .map(vo -> vo.getYear())
				 .forEach((year) -> {
					 System.out.println("6. " + teamId + " > " + year);
				 });
		});
		
		// 7. TeamID별 출전 연도를 중복제거하여 모두 출력 (group)
		Map<String, List<AllStarFullVO>> yearMap2 = list.stream()
				.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		
		yearMap2.forEach((teamId, value) -> {
			
			value.stream()
				.map(vo -> vo.getYear())
				// map으로 바꿔놓고 distinct를 하는 것이 좋음
				.distinct()
				.forEach((year) -> {
					System.out.println("7. " +  teamId + " > " + year);
				});
			
		});
		
		
		
	}
}
