package com.ktdsuniversity.edu.lamda;

@FunctionalInterface
public interface Computable {

	// 구현되지 않은 메소드는 반드시 한 개만 존재하여야 함.
	public int sum(int numberOne, int numberTwo);
	
}
