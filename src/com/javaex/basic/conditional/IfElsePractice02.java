package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 과목번호 입력
		System.out.println("과목을 선택하세요.\n(1.자바  2.C  3.C++  4.파이썬)\n과목번호: ");
		
		// 코드값에 입력값이 들어가는데,
		int code = scanner.nextInt();
		
		if (code == 1) {
			System.out.println("R101호 입니다.");	
			} else if (code == 2) {
				System.out.println("R202호 입니다.");
			} else if (code == 3) {
				System.out.println("R203호 입니다.");
			} else if (code == 4) {
				System.out.println("R204호 입니다.");
			}else {
				System.out.println("상담원에게 문의하세요.");
				}
		scanner.close();
			}

}