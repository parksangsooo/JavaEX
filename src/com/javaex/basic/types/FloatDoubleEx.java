package com.javaex.basic.types;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// float (4byte)
		// Double (8byte) -> default
		float floatVar;
		double doubleVar;
		
		// 정밀도 체크
		floatVar = 0.12345678901234567890f; // float 맨 뒤에 f
		doubleVar = 0.12345678901234567890;
		
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);
		
		int intVar; // E표기법
		intVar = 300000000;
		floatVar = 3E9F;
		doubleVar = 3E-9;
		
		System.out.println("int:" + intVar);
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);
		
		// 부동 소수점 계산의 유의점
		// float, double형은 정밀도 포기하고 표현 범위만 넓힌 데이터
		// 정밀한 데이터 다룰 때는, float, double은 안쓰는게 좋음.
		System.out.println(0.1 * 3);
		
	}

}
