package com.javaex.api.objectclass.rectangle;

public class Rectangle {
	private int height;
	private int width;
	private int area;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
		this.area = height * width;
	}
	
	@Override
	public boolean equals(Object a) {
		if (a instanceof Rectangle) {
			Rectangle other = (Rectangle)a;
			return this.area == other.area;
		}
		return super.equals(a);
	}
}
