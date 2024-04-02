package com.javaex.oop.methods;

public class MethodPractice {

	public static void main(String[] args) {
		// 입력이 없고 출력도 없는 메서드.
		// 문제1
		printHelloMethod();
		
		// 문제2
		printNumbers();
		
		// 문제3
		int random = getRandomNumber();
		System.out.println(random);
		
		// 문제4
		int result = getSum();
		System.out.println(result);
		
		// 문제5
		printOddOrEven(2024);
		
		// 문제6
		printStringLengh("Java Programming");
		
		// 문제7
		int largeNum = getLargeNumber(10, 20);
		System.out.println(largeNum);
		
		// 문제8
		System.out.println(concatenateStrings("안녕", "하세요."));
		
		//문제9
		System.out.println("합계 : " + sumAll(1,2,3,4,5,6,7,8,9));
		
		//문제10
		System.out.println(concatenateStrings("안녕", "하세요.", "용사님."));

	}
//	문제1. 콘솔에 “Hello Method!”를 출력하는 메서드를 작성하세요.
//	메서드명 : printHelloMethod
//	입력 : 없음
//	리턴 : 없음
	private static void printHelloMethod() {
		System.out.println("Hello Method!");
	}
	
//	문제2. 1부터 10까지의 숫자를 콘솔에 출력하는 메서드를 작성하세요
//	메서드명 : printNumbers
//	입력 : 없음
//	리턴 : 없음
	private static void printNumbers() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");	
		}
		System.out.println();
	}

//	문제3. 0 ~ 100사이의 랜덤한 정수를 반환하는 메서드를 작성하세요.
//	메서드명 : getRandomNumber
//	입력 : 없음
//	리턴 : 랜덤한 정수
	private static int getRandomNumber() {
		int random = (int)(Math.random()*101 + 0);
		return random;
	}

//	문제4. 1부터 10까지의 합(55)을 반환하는 메서드를 작성하세요
//	메서드명 : getSum
//	입력 : 없음
//	리턴 : 계산된 정수
	private static int getSum() {
//		int sum = 0;
//		int[] num = new int[10];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = i + 1; // 배열값 입력
//			}
//		for (int i = 0; i < num.length; i++) {
//			sum = sum + num[i]; // 입력된 숫자들 합
//		}
//		return sum;
		
		int result = 0;
		for (int i = 0; i <= 10; i++) {
			result += i;
		}
		return result;
	}

/*입력이 있고 출력은 없는 메서드*/
	
//	문제5. 정수를 하나 받아 그 정수가 짝수인지 홀수인지를 콘솔에 출력하는 메서드를 작성하세요.
//	메서드명 : printOddOrEven
//	입력 : 정수
//	리턴 : 없음
//
	private static void printOddOrEven(int num) {

// 삼항연산으로 작성 : 조건식 ? 참일 때 값 : 거짓일 때의 값
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		
		//if 문으로도 작성 가능
	}
//	문제6. 문자열을 하나 받아 그 문자열의 길이를 콘솔에 출력하는 메서드를 작성하세요
//	메서드명 : printStringLengh
//	입력 : 문자열
//	리턴 : 없음	
	
	private static void printStringLengh(String str) {
		System.out.println(str.length());
	}
	
/*입력이 있고 출력도 있는 메서드*/
//
//	문제7. 두 정수를 받아 큰 수를 반환하는 메서드를 작성하세요
//	메서드명 : getLargeNumber
//	입력 : 두 개의 정수
//	리턴 : 계산된 정수
//
	private static int getLargeNumber(int val1, int val2) {
		if (val1 > val2) {
			return val1;
		}else{
			return val2;	
		}
	}

//	문제8. 문자열 두 개를 받아 하나로 합쳐 반환하는 메서드를 작성하세요
//	메서드명 : concatenateStrings
//	입력 : 두 개의 문자열
//	리턴 : 합쳐진 입력 문자열
//
	private static String concatenateStrings(String str1, String str2) {
		return str1 + str2;
	}
	
/*	가변인자 연습*/
//
//	문제9. 가변인자로 전달된 모든 정수의 합을 반환하는 메서드를 작성하세요
//	메서드명 : sumAll
//	입력 : 정해지지 않은 개수의 정수
//	리턴 : 합산된 결과 정수
//
	private static int sumAll(int ... num) {
		int sum = 0;
		for (int val : num) {
			sum += val;
		}
		return sum;
	}
//	문제10. 가변인자로 전달된 모든 문자열을 연결해서 반환하는 메서드를 작성하세요
//	메서드명 : concatenateStrings
//	입력 : 정해지지 않은 개수의 문자열
//	리턴 : 합쳐진 문자열

	private static String concatenateStrings(String ... str) {
		String result = "";// 문자열 초기화 할때는 공란
		
		for (String val : str) {
			result += val;
		}
		return result;
	}
	
}
