package com.javaex.basic.loop;

import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args) {
		// 스캐너 열기 
		Scanner scan = new Scanner(System.in);
		
		// 단 입력 받기
		System.out.print("단을 입력해 주세요.\n단 : ");
		int dan;
		int i = 1;
				
		dan = scan.nextInt();
		
		// 1 ~ 9까지 for loop
		for (i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
				
		// 스캐너 닫기
		scan.close();
	}

}
