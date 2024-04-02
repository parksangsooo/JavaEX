package com.javaex.oop.point.v3;

// v3. 메서드 오버로딩
// 메서드 시그니쳐 : 반환 타입, 이름은 같고
// 매게변수의 타입, 순서, 갯수만 다른 메서드는 중복변환 할 수 있다.
public class Point {
	
	private int x;
	private int y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;	
	}
	
//	public void setX(int x) {
//		this.x = x;
//	}
	
	public int getY() {
		return y;	
	}
	
//	public void setY(int y) {
//		this.y = y;
//	}
	
	// 일반 메서드
	public void draw() {
		System.out.printf("점 [x= %d, y= %d]을 그렸습니다.\n", x, y);
	}
	
	// 메서드 오버로딩
	// boolean bDraw -> true 면 그렸습니다. -> false 면 지웠습니다.
	
	public void draw(boolean bDraw) {
		String message = String.format("점[x=%d, y=%d]을 ", x, y);
		
		message += bDraw ? "그렸습니다." : "지웠습니다.";
		
		System.out.println(message);
	}
}
