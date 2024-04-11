package com.javaex.basic.operators;

public class CondOperEx {

	public static void main(String[] args) {
		// 3항 연산자
		int a = 10;
		
		// 만약 a가 짝수면 "짝수", 홀수면 "홀수" 출력
		
		String result = a % 2 == 0 ? "짝수": "홀수";
		System.out.println(a + "는 " + result + " 입니다.");
		
		int score = 70;
		String message;
		
		// score 가 80점 이상 : GOOD score > 80
		// score 가 50 ~ 80 : PASS score >= 50
		// score 가 50 미만 : FAIL 나머진 fail
		
		message = score >= 80 ? "Good": score >= 50 ? "Pass": "Fail";
		System.out.println(message);
		
		

	}

}
