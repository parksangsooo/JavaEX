package com.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawable {
	// 필드
	
	private int width;
	private int height;
	
	// 생성자
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
		
	}
	
	// 추상 메서드 구현
	@Override
	public void draw() {

		System.out.printf("사각형[x=%d, y=%d, w=%d, h=%d, area=%f]을 그렸어요.%n",
				x, y, width,height,area());
		
	}
	
	@Override
	public double area() {
		return width * height;
	}
	
}
