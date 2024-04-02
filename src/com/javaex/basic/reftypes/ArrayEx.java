package com.javaex.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열 생성하는 여러가지 방법
		String[] names; // 타입[] 식별자
		int scores[]; // 타입 식별자[]
		
		// 초기화
		names = new String[] { // 참조타입 = new 키워드로 기본값과 함께 생성하는 방법
			"kim", "lee", "park", "jeong"
		};
		
		float height[] = { // 값 목록을 가지고 있을 때
				175.5f,
				170.2f,
				180.3f,
				165.2f,
		}; 
		
		scores = new int[4]; //값을 가지고 있지 않고, 공간의 갯수만 알고 있을 때 || 꼭 공간의 갯 수를 명시. 
		
		// .length 체크
		// 인덱스 접근 0부터
		// 총 길이 .length - 1
		
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100; // IndexOutOfBounds
			
		for (int i=0; i < names.length; i++) {
			// 총 길이 .length - 1
			System.out.printf("%s (%.2f) : score = %d%n", 
					names[i], height[i], scores[i]);
		}
	}
}
//		// int 형 배열 선언 & 초기화
//		int[] score = new int[5]; // int 타입의 값 5개가 저장될 빈 공간 생성
//		score[0] = 10; // 각 빈공간에 값을 초기화
//		score[1] = 20;
//		score[2] = 30;
//		score[3] = 40;
//		score[4] = 50;
//
//		// for문으로 배열을 순차적으로 순회에 값을 넣어주는 방법도 있다.
//		for(int i = 0 ; i < score.length ; i++){
//			number[i] = i * 10;
//		}
//
//		// 처음부터 선언 + 초기화를 한번에 진행
//		int[] score2 = {10, 20, 30, 40, 50};
//		
//		// String 형 배열 선언 & 초기화
//		String[] name = new String[3]; // String 타입의 값 3개가 저장될 빈 공간 생성
//		name[0] = "wi"; // 각 빈공간에 값을 초기화
//		name[1] = "kim";
//		name[2] = "park"
//
//		// 처음부터 선언 + 초기화를 한번에 진행
//		String[] strArr2 = {"wi", "kim", "park"};
//		
//		int[] iArr = {100, 95, 80, 70, 60};
//
//		System.out.println(iArr); // [I@7ad041f3
//		// [I : 배열 integer
//		// @7ad041f3 : 주소값
//		
//		
//		import java.util.Arrays; // Arrays.toString()을 사용하기 위한 import
//
//		class Test{
//			public static void main(String[] args) {
//		        int[] iArr = {100, 95, 80, 70, 60};
//		        
//		        // 루프문으로 직접 배열 원소 출력
//		        for(int i = 0 ; i < iArr.length; i++){
//		            System.out.println(iArr[i]);
//		        }
//
//		        // Arrays.toString() 메서드 사용하여 심플하게 바로 출력
//		        System.out.println(Arrays.toString(iArr)); // [100, 95, 80, 70, 60]
//			}
//		}
//		
//	}
//
//}
