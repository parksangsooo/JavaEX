package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("Nikon", 400000);

		Goods pc = new Goods("LG그램", 900000);

		Goods cup = new Goods("머그컵", 2000);

		
		// 상품정보 출력
		camera.showInfo();
		pc.showInfo();
		cup.showInfo();
	}
	
	

}
