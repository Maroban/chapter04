package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {

		// 포인트 리스트로 관리
		MyList<Point> pList = new MyList<Point>();
		
		Point p01 = new Point(2, 4);
		Point p02 = new Point(5, 10);
		
		Circle c03 = new Circle(10);
		
		pList.add(p01);
		pList.add(p02);
		// pList.add(c03); // Point에 Circle 들어가는 것이 문제 ( 다른 인스턴스도 들어간다 )
		
		for(int i = 0; i  < pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		
		
		
		
		
		
		
		

	}

}
