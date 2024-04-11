package com.javaex.exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {

		
		String str = new String("hello");
		str = null;
		
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.err.println("null 값이 들어갔습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		finally {
			System.out.println("예외처리 종료");
		}
		
	}

}
