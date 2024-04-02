package com.javaex.basic.types;

public class CastingEX {

	public static void main(String[] args) {
		// 1. 암시적 캐시팅(Promotion)
		promotionEX();
		// 2. 명시적 캐스팅(CASTING)
		castingEX();
		
	}
	
	public static void promotionEX() {
		// 표현 범위가 좁은 자료형 -> 넓은 자료형으로의 변환
		// 암묵적으로 자동으로 캐스팅을 수행
		// byte -> short -> int -> long
		// float -> double
		byte b = 25; // 1바이트 정수형
		System.out.println(b);
		
		short s = b; // 2바이트
		System.out.println(s);
		
		int i = s; // 4바이트
		System.out.println(i);
		
		long l = i; // 8바이트
		System.out.println(l);
		
		float f = l; // 8바이트 정수 -> 4바이트 실수
		System.out.println(f);
		
		double d = f; // 4바이트 실수 -> 8바이트 실수
		System.out.println(d);
		
		char ch = 'A';
		short s2 = (short)ch; // unsigned int (2) -> 2바이트 정수
		System.out.println(s2);
	
	}
	
	public static void castingEX() {
		// 표현 범위가 넓은 자료형 -> 좁은 자료형으로의 변환
		// 데이터의 유실 위험 O -> 반드시 강제 타입 변환이 필요함.
		double d = 1234567.890;
		System.out.println(d);
		
		float f = (float)d; // 8바이트 실수 -> 4바이트 실수
		System.out.println(f);
		
		long l = (long)f; // 4바이트 실수-> 8바이트 정수
		System.out.println(l);
		
		int i = (int)l; // 8바이트 정수-> 4바이트 정수
		System.out.println(Integer.toBinaryString(i));
		
		short s = (short)i; // 4바이트 정수-> 2바이트 정수
		System.out.println(s);
	}

}
