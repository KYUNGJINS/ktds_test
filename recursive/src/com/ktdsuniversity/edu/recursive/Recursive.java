package com.ktdsuniversity.edu.recursive;

import java.io.File;

public class Recursive {

	/**
	 * 재귀 호출
	 */
	public void recursive() {
		System.out.println("실행중....");
		recursive(); // recursive 내에서 recursive를 또 호출
	}

	public void readFile(File file) {
		
		File[] fileList = file.listFiles();
		
		for (File file2 : fileList) {
			System.out.println(file2.getAbsolutePath());
			if(file2.isDirectory()) {
				readFile(file2);
			}
		}
	}
		
	
	
	public static void main(String[] args) {
		Recursive recursive = new Recursive();
//		recursive.recursive();
		
		// 재귀 호출을 쓰지 않았을 때 파일을 탐색하는 방법이 얼마나 힘든지 확인하는 것
		recursive.readFile(new File("C:\\Devs"));
		
	}
}
