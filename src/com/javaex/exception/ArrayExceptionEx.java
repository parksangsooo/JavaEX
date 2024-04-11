package com.javaex.exception;

public class ArrayExceptionEx {

	public static void main(String[] args) {
		
		int[] intArray = new int[]{3,6,9};
		
		try {
			System.out.println(intArray[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 틀림");
			
		} catch (Exception e) {
			e.printStackTrace(); 
			
		} finally {
			System.out.println("예외처리 종료.");
		}
		

	}

}
