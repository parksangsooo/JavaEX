package com.javaex.basic.conditional;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner scanner = new Scanner(System.in);
		
		// 점수 입력
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
				
		// 3배수 판별
		if (score % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println(score + "은 3의 배수가 아닙니다.");
		}
		
		// 스캐너 닫기
		scanner.close();

	}

}
