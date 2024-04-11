package com.javaex.basic.loop;

public class WhileEX {

	public static void main(String[] args) {
		// While 반복문
		// 조건을 만족하는 동안 블록을 반복한다.
		// 반복 조건 제어 변수 필요, 조건 변수를 개발자가 직접 제어해야함.
		int num = 0;
		while(num <= 20) {
			System.out.println("I Like Java" + num);
			num = num + 1;
			//num =+ 1;
		}

	}

}
