package com.javaex.basic.reftypes;

public class StringFormatEx {

	public static void main(String[] args) {
		// %s(문자열), %d(십진수), %n(개행)
		
		// __ 개의 __ 중에서 __ 개를 먹었다.
		
		String fruit = "사과";
		int total = 10, eat = 3;
		
		System.out.printf("%d 개의 %s 중에서 %d 개를 먹었다.%n", 
				total, fruit, eat);

		// %d 의 천단위 구분 기호 : %,d
		
		int amount = 1_234_567_890;
		System.out.printf("%,d%n", amount);
	
		
		// %d 의 천단위 구분 기호 : %,d || 실수표시 :  %f, %.2f
		
		double pi = Math.PI; // 상수 파이
		System.out.printf("PI: %f%n", pi);
		System.out.printf("PI: %.2f%n", pi); // 소숫점 2째자리 까지 표시
		
		// 포맷 형식은 String 형의 .format 메서드에서 구현된다.
		
		String fmt = "%d개의 %s 중에서 %d개를 먹었다.%n"; 
		System.out.println(fmt.formatted(10, "바나나", 2));
	}

}
