package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
				
		// 선언 이후 할당
		String str1; // 선언 (null 상태)
		str1 = "Java"; // 할당		
		
		// 선언과 동시에 할당
		String str2 = "Java";
		
		// new 활용 객체생성	
		String str3 = new String("Java");
		
		// 세 참조 변수는 같은 값을 가지고 있음.
		// 참조 변수의 경우 == 은 메모리 주소의 비교임.
		
		System.out.println(str1 == str2); 
		System.out.println(str2 == str3); // 같은 값은 가지고 있지만, 구조 자체가 다르기 때문에 False 가 맞다.

		// 객체 내부의 값의 비교를 할 때는 .equals **무조건 메서드를 이용해야 함.

		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str3));
		
				
	}

}
