package com.javaex.basic.types;

import java.util.Calendar;

public class constantEX {

	public static void main(String[] args) {
		// 상수 : 변하지 않는 값
		// 초기화, 조회는 가능 But 재할당 불가
		final double PI = 3.14159; // 상수의 이름은 모두 대문자, _로 단어 구분
		final int SPEED_LIMIT = 100;
			
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		// 재할당 불가
//		SPEED_LIMIT = 100;
		
		System.out.println("현재 제한 속도는 " + SPEED_LIMIT + " 입니다");
		System.out.println("제한 속도 " + SPEED_LIMIT + " 이하로 주행해 주세요");
		
		// 상수의 주요 사용 목적
		// 1) 코드 식별(가독성)을 높인다.
		// 2) 특정 데이터를 한 곳에서 일괄 관리 하기 위함.
		// 3) 코드를 변경할 수 없다(불변성)
		System.out.println(Calendar.JANUARY);

	}

}
