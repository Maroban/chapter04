package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		// HashSet
		Set<Integer> iSet = new HashSet<Integer>();

		Integer i01 = 4;
		Integer i02 = 5;
		Integer i03 = 6;

		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);

		System.out.println(iSet.size());  // 값의 개수 확인
		System.out.println(iSet.toString());  // 출력
		
		System.out.println("======================");
		for (Integer num : iSet) {  // 향상된 for문
			System.out.println(num.toString());
		}

		Integer i04 = 5;  // 중복 값 확인
		iSet.add(i04);

		System.out.println("======================");
		for (Integer num : iSet) {
			System.out.println(num.toString());  // 중복 저장이 안되므로 4, 5, 6이 나온다.
		}
		
		
	}

}
