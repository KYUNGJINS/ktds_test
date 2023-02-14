package com.ktdsuniversity.edu.member;

public class Main {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();

		memberService.setUserName("장민창");
		/*
		 * 반환타입이 있으면 반드시 그 타입으로 맞추어서 반환을 시켜야 한다.
		 * 반환타입이 String이었기 때문에 String으로 할당해주는 것
		 */
		String userName = memberService.getUserName();
		System.out.println(userName);
		
		memberService.join();
//		memberService.login(); // private 에러 발생
		memberService.quit();
	}

}
