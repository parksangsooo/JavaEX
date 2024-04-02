package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 숫자 입력
		System.out.print("숫자를 입력하세요.\n숫자: ");
		int num = scanner.nextInt();
		
		// 양수 일때 : 짝수 -> 짝수, 홀수 -> 홀수
		// 음수
		// 0
		if (num > 0) {
			String result = num % 2 == 0 ? "짝수": "홀수";
			System.out.println(result + "입니다.");
		} else if (num < 0) {
			System.out.println("음수 입니다.");			
		} else {
			System.out.println("0 입니다.");
		}
		scanner.close();
	}

}
