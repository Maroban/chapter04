package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	// 필드
	private Circle[] cArray;
	private int pos;

	// 생성자
	public CircleList() {
		this.cArray = new Circle[3];
		pos = 0;
	}

	// 메소드 - GS

	// 메소드 - 일반
	public void add(Circle circle) {
		cArray[pos] = circle;
		pos++;
	}

	public int size() {
		return pos;
	}
	
	public Circle get(int index) {
		return cArray[index];
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", pos=" + pos + "]";
	}

}
