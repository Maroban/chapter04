package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {
		
		System.out.println("---------- Point 관리 ----------");
		MyList pList = new MyList(); 
		
		Point p01 = new Point(5,5);
		Point p02 = new Point(10,10);
		Point p03 = new Point(15,15);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		System.out.println("---------- Circle 관리 ----------");
		MyList cList = new MyList();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		Circle c03 = new Circle(15);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
