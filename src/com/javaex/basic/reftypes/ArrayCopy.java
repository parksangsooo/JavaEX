package com.javaex.basic.reftypes;

import java.util.Arrays;

public class ArrayCopy {
	// 배열은 크기 변경이 불가하기 때문에
	// 공간을 늘리고자 한다면, 새 배열을 생성 후 복사해 줘야 한다.
	
	public static void main(String[] args) {
		// for 문을 이용한 배열 복사
		arrayCopyByFor();
				
		// System을 이용한 배열 복사
		arrayCopyBySystem();
	}
	
	public static void  arrayCopyByFor() {
		int scores[] = {1,2,3}; // .length == 3, 0~2
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		
		// 새 공간을 만들어서 복사
		int target[] = new int[10];
		
		for (int i = 0; i < scores.length; i++) {
			target[i] = scores[i];
		}
		
		// 배열 유틸리티 class 이용한 출력
		
		System.out.println(Arrays.toString(target));
		
		
	}
	public static void  arrayCopyBySystem() {
		int source[] = {1,2,3};
		int target[] = new int[10];
		
		System.out.println("source: " 
							+ Arrays.toString(source));
		// 배열 복제
		
		System.arraycopy(source, // 원본 배열
				0, // 복사할 시작 인덱스(원본)
				target, // 복사해서 붙여 넣을 대상 배열
				3, // 대상 배열의 시작 인덱스
				source.length); // 원본에서 복사할 길이
		System.out.println("target: " 
							+ Arrays.toString(target));
		
		// Enhanced For 문
		// for (추출된 데이터 : 원본 배열 혹은 컬렉션)
		for (int val: target) {
			System.out.print(val + "\t");
		}
		System.out.println();
		
	}
}
