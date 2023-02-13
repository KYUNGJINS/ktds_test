package com.ktdsuniversity.edu.market;

public class Buyer {

	private String name;
	private int money;
	private int stock;

	public Buyer(String name, int money, int stock) {
		this.name = name;
		this.money = money;
		this.stock = stock;
	}
	
	public void buy(Seller seller, int orderCount) {
		this.money -= orderCount * 1_000; // 사과의 가격은 1,000원
		this.stock += orderCount;
		seller.sell(orderCount); // 이 부분이 핵심!
	}

}
