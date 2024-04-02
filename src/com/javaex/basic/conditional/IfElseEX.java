package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEX {

	public static void main(String[] args) {
		// 정수 입력, 60점 이상이면 합격입니다. 출력
		// tip : Ctrl+스페티스바 (자동 임프로)
		// 		 Ctrl+shift+O (전부 보여줌)
				// 1) 스캐너 열기
		Scanner scanner = new Scanner(System.in);
			
		// 2) 점수 입력 받기
		int score;
				
		System.out.print("점수는?: ");
		score = scanner.nextInt();
		
		// 3) 점수 비교
		
		if (score >= 60) {
			System.out.println("합격 입니다.");	
		} else {
			System.out.println("불합격 입니다.");
		}
						
		// 3) 스캐너 닫기
		scanner.close();

	}

}
