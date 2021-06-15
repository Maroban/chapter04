package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();

		Point p01 = new Point(2, 4);
		Point p02 = new Point(4, 8);
		Point p03 = new Point(8, 16);
		Point p04 = new Point(4, 8);

		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);

		for (Point p : pSet) {
			System.out.println(p.toString());
		}

		System.out.println(pSet);

	}

}
