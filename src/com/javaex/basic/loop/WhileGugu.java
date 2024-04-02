package com.javaex.basic.loop;

import java.util.Scanner;

public class WhileGugu {

	public static void main(String[] args) {
		// 스캐너 열기 
		Scanner scan = new Scanner(System.in);
		
		// 단 입력 받기
		System.out.print("단을 입력해 주세요.\n단 : ");
		int num = 1, dan;
		
		dan = scan.nextInt();
		
		// 1 ~ 9까지 while loop
		// 단 x num 출력
		while (num <= 9) {
			System.out.println(dan + "*" + num + "=" + (dan * num));
			num += 1;
		}
		
		// 스캐너 닫기
		scan.close();
	}

}
