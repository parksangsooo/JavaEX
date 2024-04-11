package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx2 {

	public static void main(String[] args) {
		// 숫자를입력받아 숫자가0보다크면 “양수” 영보다작으면 “음수” 0일때는 “0입니다.”을 출력하세요
		
		// 1) 스캐너 열기
		Scanner scanner = new Scanner(System.in);
				
		// 2) 숫자 입력
		System.out.print("숫자를 입력하세요.\n숫자입력: ");
		int num = scanner.nextInt();
				
//		// 3) 숫자 조건문
//		if (num > 0) {
//			System.out.println("양수 입니다.");
//		} else if (num < 0) {
//			System.out.println("음수 입니다.");			
//		} else {
//			System.out.println("0 입니다.");
//		}
//			
//		
		// 중첩 if
		if (num == 0) {
			System.out.println("0 입니다.");
		} else {
			if (num > 0) {
				System.out.println("양수 입니다.");
			} else {
				System.out.println("음수 입니다.");
			}
		}
		
		// 4) 스캐너 닫기
		scanner.close();	

	}

}
