package com.javaex.basic.operators;

public class ArithOperEX {

	public static void main(String[] args) {
		// 1. 산술연산
		arithOperTest();
		// 2. 증감연산(디버거)
		// 어떤 지점에서 디버그를 시작할 것인가가 중요.(브레이크 포인트)
		// ex. 7, 37
		incrOperTest();
		// 3. 할당연산
		assignOperTest();

	}
	public static void arithOperTest() {
		int a = 7;
		int b = 3;
		
		// 부호 연산자 (+, -)
		System.out.println(-a);
		System.out.println("-------------------------");
		
		// 사칙연산(+, -, *, /, %)
		System.out.println(a + b); // 10
		System.out.println(a - b); // 4
		System.out.println(a * b); // 21
		System.out.println(a / b); // 2
		System.out.println(a % b); // 1
		System.out.println("-------------------------");
		
		// 정수의 나눗셈은 정수 but 강제 캐스팅으로 정수 -> 실수
		System.out.println(a / b); // 2
		System.out.println((float)a / (float)b); // 7.0 / 3.0
		System.out.println((float)a / b); // 큰 쪽으로 맞춰지기에
	}
	public static void incrOperTest() {
	int a = 10;
	int b;
	
	System.out.println(a);
	b = ++a;
	System.out.println(b);
	System.out.println(a);
	
	a = 10; // 원상복구
	System.out.println(a);
	b = a++;
	System.out.println(b);
	System.out.println(a);
	}
	public static void assignOperTest() {
		// = : 우선순위 가장 마지막 - 확장 할당연산
		int a = 7;
		int b = 3;
		
		a = a + b;
		System.out.println(a); // 10
		a += b;// <<< 확장 할당 연산
		System.out.println(a); // 10
	}
}
