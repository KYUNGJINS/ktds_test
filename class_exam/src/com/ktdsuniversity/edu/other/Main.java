package com.ktdsuniversity.edu.other;

import com.ktdsuniversity.edu.member.MemberService;

public class Main {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();

		memberService.setUserName("장민창");
		String userName = memberService.getUserName(); 
		System.out.println(userName);
		
		memberService.join();
//		memberService.login(); // private 에러 발생
//		memberService.quit();
	}

}
	
	

