package com.ktdsuniversity.edu.infext;

public class Main {

	public static void memberManage(MemberService memberService) {
		memberService.regist();
		memberService.updateMyInfo();
		// memberService가 VIPMemberService의 객체라면
		// 캐스팅해서 memberService를 실행한다.
//		if (memberService instanceof VIPMemberService) {
//			VIPMemberService vipMemberService = (VIPMemberService) memberService;
//			vipMemberService.addPoint(50);
//			((VIPMemberService) memberService).addPoint(50);
//		}

		memberService.unregist();

	}

	public static void main(String[] args) {

		// Sub class is a Super class
		MemberService memberService = new MemberServiceImpl();
		MemberService vipMemberService = new VIPMemberServiceImpl();

		memberManage(memberService);
		memberManage(vipMemberService);

	}

}
