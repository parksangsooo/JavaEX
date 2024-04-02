package com.javaex.exception.sample;

import java.io.IOException;

//사용자 정의 예외
class CustomArithException extends ArithmeticException {
	// 필드 생성
	private int num1;
	private int num2;

	// 초기화를 위한 파라미터 3개짜리 생성자
	public CustomArithException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

}

public class ThrowsExceptEx {

// CheckedException : 반드시 예외 처리 필요.
//	- try ~ catch
//	- throw 로 예외 던지기를 한 경우
	public static void main(String[] args) {
		ThrowsExcept except = new ThrowsExcept();

		try {
			except.divide(100, 0);
			except.executeRuntimeException();
			except.excuteExcept(); // CheckedException을 반드시 예외 처리!

		} catch (IOException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());

		} catch (CustomArithException e) {
			System.err.println("에러메세지: " + e.getMessage());
			// 상황 정보 확인
			System.err.println("나누어지는 수:" + e.getNum1());
			System.err.println("나누는 수:" + e.getNum2());

		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}

	}

}
