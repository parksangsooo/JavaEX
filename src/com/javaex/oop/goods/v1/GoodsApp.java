package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		// 생성자 한번에 바꾸기. Alt+shift+R
		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 400_000;
		
		Goods pc = new Goods();
		pc.name = "LG그램";
		pc.price = 900_000;
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2_000;
		
		// 상품 정보 출력
		System.out.printf("%s, %,d원%n",
				camera.name,
				camera.price);
		System.out.printf("%s, %,d원%n",
				pc.name,
				pc.price);
		System.out.printf("%s, %,d원%n",
				cup.name,
				cup.price);
	}

}
