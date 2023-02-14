package com.ktdsuniversity.edu.infext;

public class VIPMemberServiceImpl extends MemberServiceImpl 
								   implements VIPMemberService {

	// regist와 updateMyInfo만 각각 애드포인트가 추가되도록 재정의
	@Override
	public void regist() {
//		super.regist();
		System.out.println("VIP 회원 가입이 완료되었습니다.");
		addPoint(1000);
	}

	@Override
	public void updateMyInfo() {
//		super.updateMyInfo();
		System.out.println("VIP 회원 정보 수정이 완료되었습니다.");
		addPoint(50);
	}

	@Override
	public void addPoint(int point) {
		System.out.println(point + "점이 지급되었습니다.");
	}

}
