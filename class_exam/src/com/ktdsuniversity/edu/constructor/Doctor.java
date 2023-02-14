package com.ktdsuniversity.edu.constructor;

public class Doctor {

	private String computer;
	private String tool;

	public Doctor(String a, String b) {
		this.computer = a;
		this.tool = b;
	}

	public String examination() {
		return "의사가 " + computer + "와 " + tool + "으로 진찰합니다.";

	}

}
