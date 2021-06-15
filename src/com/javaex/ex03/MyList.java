package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {

	// 필드
	private T[] oArray;
	private int crtPos;

	// 생성자
	public MyList() {
		this.oArray = (T[])new Object[3];  // oArray에 배열을 대입한다.
		crtPos = 0;
	}

	// 메소드 - GS

	// 메소드 - 일반
	public void add(T object) {    // ex) cList.add(값)  괄호 안 값을 object에 저장한다.
		oArray[crtPos] = object;  // 저장한 값을 배열인 oArray[crtPos] 에 대입한다. = > crtPos는 1씩 증감되기에 겹치지 않을 수 있는 것이다.
		crtPos++;  // 기본값이 0이기 때문에 배열 oArray[0] 부터 1씩 증감된다. = > object 값을 각각 다른 배열에 넣을 수 있음.
	}

	public int size() {
		return crtPos;  // 0부터 증감되기 때문에 방의 개수와 일치하여 이렇게 사용한다.
	}

	public T get(int index) {
		return oArray[index];  // cList.get(index) 를 사용하여 index(숫자) 방에 있는 값을 출력한다. 
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}

}
