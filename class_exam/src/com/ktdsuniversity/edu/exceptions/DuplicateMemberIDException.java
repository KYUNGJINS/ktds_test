package com.ktdsuniversity.edu.exceptions;
/**
 * 사용자 예외는 반드시 RuntimeException을 상속 받는다.
 * @author User
 *
 */
public class DuplicateMemberIDException extends RuntimeException{
	// 화면으로 전송될 예외이기 때문에, try~catch를 하면 안돼서 RuntimeException을 상속받는 것임
	
	private static final long serialVersionUID = 300748820639462251L;
	
	// 사용자 예외는 필요에 따라 생성자를 Overriding 한다.
	public DuplicateMemberIDException(String memberID) {
		super(memberID); // 부모의 생성자
	}
}
