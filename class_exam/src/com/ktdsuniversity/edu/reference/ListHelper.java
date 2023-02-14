package com.ktdsuniversity.edu.reference;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {

	private List<Integer> intList;

	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}
	
	// 객체 참조: getIntList는 위에서 intList의 메모리 주소를 리턴한 것
	public List<Integer> getIntList() {
		return intList;
	}

	public void addInteger(int value) {
		intList.add(value);
	}

	public int getSize() {
		return intList.size();
	}
}
