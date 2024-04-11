package com.javaex.basic.conditional;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// 점수를입력받아등급을표시하는프로그램을작성하세요
//		90점이상 이면“A등급”
//		80점이상~89점이면“B등급”
//		70점이상~79점이면“C등급”
//		60점이상~69점이면“D등급”
//		60점미만이면“F등급
		//스캐너 시작
		Scanner scanner = new Scanner(System.in);
		
		//점수 입력
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		
		//if else
//		if (score >= 90) {
//			System.out.println("A등급");
//		} else if (score >= 80) {
//			System.out.println("B등급");
//		}else if (score >= 70) {
//			System.out.println("C등급");
//		}else if (score >= 60) {
//			System.out.println("D등급");
//		}else if (score < 60) {
//			System.out.println("F등급");
//		}else {
//			System.out.println("?");
//		}
		
		//switch
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;		
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default:
			System.out.println("F등급");
			break;
		}
		
		//스캐너 닫기
		scanner.close();
		
	}

}
