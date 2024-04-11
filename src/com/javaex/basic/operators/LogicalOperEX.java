package com.javaex.basic.operators;

public class LogicalOperEX {

	public static void main(String[] args) {
		int a = 7;
		int b;
		b = 3;
		
		// 1) "비교 연산자"는 결과값으로 논리값을 반환한다. : >=, <=, >, <, ==, !=
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);				
		
		// 2) "논리 연산자"
		// 논리곱(AND : &&)
		// 논리합(OR : ||)
		// 논리부정(NOT : !)
		
		int c = 5;
		
		// C는 0초과, 10 미만의 값인가?
		// 조건 1은 C > 0?
		// 조건 2 : C < 10?
		// 결과 : 조건 1과 조건 2를 모두 만족시켜야 함.
		
		boolean r1 = c > 0; //조건 1
		boolean r2 = c < 10; // 조건 2
		boolean result = r1 && r2;
		System.out.println(result);
		
		// C가 0 이상이거나 10 이상인가?
		// 조건 1 : c <= 0
		// 조건 2 : c >= 10
		r1 = c <= 0;
		r2 = c >= 10;
		result = r1 || r2;
		System.out.println(result);
		
		//문제 1의 논리 부정
		// c <=0 || c >= 10) 논리 결과와 동일
		result = !(c > 0 && c < 10);
		System.out.println(result);
		
		//문제 2의 논리 부정
		// c > 0 && c < 10 논리 결과와 동일
		result = !(c <= 0 || c >= 10);
		System.out.println(result);
		
	}

}
