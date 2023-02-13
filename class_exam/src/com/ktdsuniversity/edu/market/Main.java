package com.ktdsuniversity.edu.market;
/**
 * 객체 참조: buyer에게 seller를 참조하려는 코드
 * @author User
 *
 */
public class Main {

	public static void main(String[] args) {
								// (이름, 돈, 사과 개수)
		Buyer buyer = new Buyer("장민창", 5_000_000, 0);
								// (이름, 돈, 사과 개수)
		Seller seller = new Seller("이동학", 10_000_000, 10);
		
		// 판매자에게 5개 산다.
		buyer.buy(seller, 5);
	}
	
}
