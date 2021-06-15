package com.javaex.ex04;

import java.util.ArrayList;

public class PointApp {

	public static void main(String[] args) {

		ArrayList<Point> pList = new ArrayList<Point>();   // <> 안에 기본자료형은 못 쓴다. 대신 Integer 등 가능

		Point p01 = new Point(2, 4);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(4, 8);
		Point p04 = new Point(5, 10);

		pList.add(p01);
		System.out.println(pList.get(0) + ", " + pList.size() + "개");

		pList.add(p02);
		System.out.println(pList.get(1) + ", " + pList.size() + "개");

		pList.add(p03);

		Point p = pList.get(1);
		System.out.println(p.getX()); // X값 출력
		System.out.println(p.getY()); // Y값 출력
		System.out.println(p.toString());
		System.out.println(p);

		System.out.println("================================================");

		for (int i = 0; i < pList.size(); i++) {
			Point pp = pList.get(1);
			System.out.println(pp.toString());
		}

		System.out.println("================================================");

		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).getX());
		}

		System.out.println("================================================");
		System.out.println(pList.toString());

		// p04를 [1]로 add 순서 지정을 안 하면 맨 뒤로 저장이 되고, 지정할 하면 그 곳에 값이 저장된다.
		pList.add(1, p04);
		System.out.println(pList);

		// [1] 삭제
		pList.remove(1);
		System.out.println(pList);

		System.out.println("================================================");

		// 향상된 for문 무조건 처음 --> 끝까지 반복해라 (주소 1개 : 리스트 전체)
		for (Point ppp : pList) {
			// System.out.println(ppp.getX());
			System.out.println(ppp);
		}

		// pList 원 추가
		Circle c01 = new Circle(100);
		// pList.add(c01);  추가할 수 없다.
		
		ArrayList<Circle> cList = new ArrayList<Circle>();
		
		
		
		
		
		
		
		
		
		
		
	}

}
