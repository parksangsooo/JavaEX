package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point xy1 = new Point(5, 5);
//		xy1.setX(5);
//		xy1.setY(5);
		
		Point xy2 = new Point(10, 23);
//		xy2.setX(10);
//		xy2.setY(23);
		
		xy1.draw();
		xy2.draw();
		
		// 오버로딩 된 메서드 흐름
		xy1.draw(true);
		xy1.draw(false);
		xy2.draw(true);
		xy2.draw(false);

	}

}
