package com.javaex.basic.loop;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// 정해지지 않은 수의 정수를 입력 후 합산
		// 0이 입력되면 종료
		
		// 합산 변수
		// 스캐너로부터 정수 입력 받기
		// 0이면 합산 종료. 0이 아니면 입력 계속 받기	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. [0] 이면 종료!\n");	
		int total = 0, num;

		do { // 적어도 한번은 실행되어야 하는 구문
		num = scan.nextInt();
		total = total + num;
		System.out.print("합계: " + total + "\n");
		} while (num != 0);
		System.out.println("프로그램을 종료합니다.");
		
		// 스캐너 닫기
		scan.close();
	}

}
