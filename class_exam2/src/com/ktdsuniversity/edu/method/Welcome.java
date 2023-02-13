package com.ktdsuniversity.edu.method;

public class Welcome {

	// 가변인자와 배열은 같음
	public String greetings(String[] message) {
		String welcomeMessage = "";
		for (String msg : message) {
			welcomeMessage += msg + "님, ";
		}
		
		welcomeMessage += "안녕하세요?";
		return welcomeMessage;
	}
	// 가변인자
	public String greeting(String... message) {
		String welcomeMessage = "";
		for (String msg : message) {
			welcomeMessage += msg + "님, ";
		}
		
		welcomeMessage += "안녕하세요?";
		return welcomeMessage;
	}
	
	
	
	public String greeting() {
		return "안녕하세요?";
	}
	
	public String greeting(String name) {
		return name + "님, 안녕하세요?";
	}
	
	public String greeting(String name, String message) {
		return name + "님, " + message;
	}
}
