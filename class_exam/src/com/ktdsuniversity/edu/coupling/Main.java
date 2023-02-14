package com.ktdsuniversity.edu.coupling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Sub class is a Super class
		Iterable<String> iterable = new ArrayList<>();
//		iterable.get(0); get을 못 씀
		
		Collection<Integer> collection = new ArrayList<>();
//		collection.get(0); get을 못 씀
		
		List<String> list = new ArrayList<>();
		list.get(0);
		list.forEach(null);
		
		MemberManagement memberService = new MemberService();
		memberService.regist();
		memberService.unregist();
		memberService.updateMyInfo();
	}
	
}
