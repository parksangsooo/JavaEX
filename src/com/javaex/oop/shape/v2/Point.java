package com.javaex.oop.shape.v2;

// 그림판에서 그려져야 하지만
// 실제로 면적을 가진 도형은 아님.
// 따라서 면적을 가진 Shape를 연결할 필요는 없지만, 그려야 하는 draw는 연결 되어야 한다.
public class Point implements Drawable {
	//필드
	private int x, y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() {
		System.out.printf(
				"점[x=%d, y=%d]을 그렸습니다.\n",
				x, y);
	}
}
