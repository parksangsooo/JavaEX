package com.javaex.basic.reftypes;

public class EnumEx {
	// enum 메서드 테스트
	public static void main(String[] args) {
		Week today = Week.WEDNESDAY;
		
		System.out.println(today);
		System.out.printf("Today is %s(%d)%n",
				today.name(), // 열거상수의 문자열 표현.
				today.ordinal()); // 열거상수의 열거 객체 내 순번 확인.
		
		String strWeek = "FRIDAY"; //문자열 데이터를 받아 열거상수를 찾는 방법.
		Week obj = Week.valueOf(strWeek);
		System.out.printf("obj is %s(%d)%n",
				obj.name(),
				obj.ordinal());
		

	}

}
