package com.javaex.basic.loop;

public class BreakEx {
	// 6의 배수이자 14의 배수인 가장 적은 정수 찾기
	// 반복 횟수를 정확하게 알기 힘든 경우 => while 문
	public static void main(String[] args) {
		
		// 반복 체크 변수
		
		int x = 1;
		
		while (true) {
			boolean z = x % 6 == 0 && x % 14 ==0;
			
			if(z == true) {
				break;
				
			} x++;
		}
		System.out.println(x);
		
		int i = 1;
		while(i <= 6) {
			System.out.print((int)(Math.random() * 45) + 1 + " ");
			i++;
		}
		
	}

}
