package com.javaex.basic.types;

public class CharEx {

	public static void main(String[] args) {
		// char : 문자 1개의 유니코드 저장
		// 내부적으로는 숫자 코드지만 출력시에는 해당 코드에 상응하는 문자 1개를 출력.
		char ch1 = 'A'; // 홑 따옴표 글자 1개
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2); // 유니코드(숫자) 이기 때문에 합산되어 숫자가 출력
		
		String str = "A한";// " 문자열 사용시 쌍 따옴표
		System.out.println(str);
	}

}
