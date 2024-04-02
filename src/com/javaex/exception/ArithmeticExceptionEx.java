package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx {

	// 사용자로부터 정수 1개 입력 받음.
	// 100을 입력받은 정수로 나눔
	// 나눗셈 결과를 화면에 출력
	public static void main(String[] args) {
		// 변수 선언
		double result = 0;
		int num;
		
		// 스캐너 개방
		System.out.print("정수입력: ");
		Scanner sc = new Scanner(System.in);
		
		try { 	// 예외 발생 가능영역을 try 블록으로 감싼다
		
			num = sc.nextInt();
			result = 100/num; 	// java.lang.ArithmeticException 발생
			
			// 앞쪽에서 구체적 에러 처리
			// 가장 마지막에 Exception으로 잔여 에러 처리
			
		} catch (InputMismatchException e) { 	// 입력 형식 에러
			System.err.println("정수로 입력해 주세요.");
			
		} catch (ArithmeticException e) {	// 100% ArithmeticException (구체적인 예외 처리 로직 수행 가능)
			System.err.println("0으로는 나눌 수 없습니다.");
			
		} catch (Exception e) { 	// 예외 (정보) 클래스로 catch (여긴 모든 예외처리)
			e.printStackTrace(); 	// 예외 스택 출력 
			
		} finally {
			// 예외 유무 상관 없이 가장 마지막에 1회 실행.
			// try 블록에서 실행된 시스템 자원 등을 해제 할때 사용
			// 필수가 아님.
			
			System.out.println("예외처리 종료");
		}
		
		System.out.println(result); // 예외 발생으로 수행되지 않음
		
		sc.close();

	}

}
