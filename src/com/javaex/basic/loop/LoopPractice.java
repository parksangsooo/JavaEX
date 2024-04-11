package com.javaex.basic.loop;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 구구단의 각 단을 출력합니다. for 문
		for(int i = 2; i <= 9; i++) { // 1부터 9까지의 각 수에 대하여
           for(int j = 1; j <= 9; j++) { // 1부터 9까지 곱하는 수
               System.out.print(i + "*" + j + "=" + (i * j) + "\n"); 
           }
           System.out.println(); // 각 단이 끝나면 줄바꿈
           }
		
		// 구구단 출력 while 문
		
		int dan = 2;
		while (dan <= 9) {
			int num = 1;
			while (num <= 9) {
				 System.out.print(dan + "*" + num + "=" + (dan * num) + "\n");
				 num++;
			}
			System.out.println();
			dan++;
		}
		
		//for 스타그리기
		int x, y;
		for(x=0; x<6; x++) {
			for(y=0; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println("");
			}		
		
		//while 스타그리기
		int a = 0;
		while (a<6) {
			int b = 0;
			while (b <= a) {
			System.out.print("*");	
			b++;
			}
			System.out.println("");
			a++;
		
		}
			}		
		}