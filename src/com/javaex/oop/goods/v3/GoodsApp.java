package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
		// 생성자 한번에 바꾸기. Alt+shift+R
//		Goods camera = new Goods(); // class 인스턴스 = new calss();
		Goods camera = new Goods("Nikon", 400000);
//		camera.setName("nikon");
//		camera.setPrice(40_000);
		
//		Goods pc = new Goods();
		Goods pc = new Goods("LG그램", 900000);
//		pc.setName("LG그램");
//		pc.setPrice(900_000);
//		pc.setPrice(-100_000);
		
		
//		Goods cup = new Goods();
		Goods cup = new Goods("머그컵", 2000);
//		cup.setName("머그컵");
//		cup.setPrice(2_000);
		
		// 상품 정보 출력
		System.out.printf("%s, %,d원%n",
				camera.getName(),
				camera.getPrice());
		System.out.printf("%s, %,d원%n",
				pc.getName(),
				pc.getPrice());
		System.out.printf("%s, %,d원%n",
				cup.getName(),
				cup.getPrice());
		
		// 상품정보 출력
		
		camera.showInfo();
		pc.showInfo();
		cup.showInfo();
	}
	
	

}
