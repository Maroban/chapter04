package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {

		// Point를 관리하는 List를 만든다. ( 배열 대신 )
		PointList pList = new PointList();

		Point p00 = new Point(2, 2);
		Point p01 = new Point(3, 3);
		Point p02 = new Point(4, 4);

		pList.add(p00);
		pList.add(p01);
		pList.add(p02);

		System.out.println(pList);

		System.out.println(pList.size()); // 3

		System.out.println(pList.get(1)); // Point [x=3, y=3]

		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		System.out.println("=====================================");

		// 원 관리 List
		CircleList cList = new CircleList();

		Circle r01 = new Circle(10);
		Circle r02 = new Circle(20);
		Circle r03 = new Circle(30);

		cList.add(r01);
		cList.add(r02);
		cList.add(r03);

		System.out.println(cList);

		System.out.println(cList.size());

		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i));
		}

		// 배열 사용할 때
		/*
		 * Point[] pArray = new Point[2];
		 * 
		 * Point p00 = new Point(2, 2); Point p01 = new Point(3, 3);
		 * 
		 * pArray[0] = p00; pArray[1] = p01;
		 * 
		 * for (int i = 0; i < pArray.length; i++) { System.out.println(pArray[i]); }
		 */

	}

}
