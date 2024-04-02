package com.javaex.basic.types;

public class intLongEx {
	public static void main(String[] args) {
		// int 형 (4byte)
		int intVar1;
		int intVar2;
		
		intVar1 = 2024;
//		intVar2 = 1234567890123;  // out of range
		
		System.out.println(intVar1);
//		System.out.println(intVar2); // 초기화 필요
		
		// long 형 데이터 (8byte)
		long longVar1;
		long longVar2;
		
		longVar1 = 2024;
		longVar2 = 1234567890123L; // long형 데이터 뒤에는 "l, L"이 입력되어야 됨.
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		long amount = 1_000_000_000_000L;	//천단위 구분 기호 _ 로 표시
		System.out.println(amount);
		
		// 진법 표기 : 2진수, 8진수(1234567->10), 16진수(0123456789ABCDEF)
		int bin, oct, hex;
		bin = 0b1100; // 2진수 ; 앞에 0b 붙여
		oct = 072; // 8진수 ; 0
		hex = 0xFF; // 16진수 ; 0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);

	}

}
