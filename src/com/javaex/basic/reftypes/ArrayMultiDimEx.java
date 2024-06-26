package com.javaex.basic.reftypes;

public class ArrayMultiDimEx {

	public static void main(String[] args) {
		// 2차원 배열의 선언
		int[][] twoDimen = new int[5][10]; // 5 x 10 5행 10열
		
		int[][] table = {
				{1,2,3,4,5,6,7,8,9,10},
				{2,3,4,5,6,7,8,9,10,1},
				{3,4,5,6,7,8,9,10,1,2},
				{4,5,6,7,8,9,10,1,2,3},
				{5,6,7,8,9,10,1,2,3,4}
		}; //5 x 10 5행 10열 배열
		System.out.println(table);
		System.out.println("table.length: " + table.length);
		System.out.println("table[0].length: " + table[0].length);
		
		
		// 내부 데이터 합산
		int sum = 0;
		// 행 루프		
		for (int row =0; row < table.length; row++) {
			// 열 루프
			for (int col = 0; col < table[row].length; col++) {
				
				System.out.print(table[row][col] + "\t");
				sum += table[row][col];
				
			}
			System.out.println("총합: " + sum);
			System.out.println();
		}
		System.out.println("총합: " + sum);

	}

}
