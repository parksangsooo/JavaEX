package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		// Shape s = new Shape();	// 추상 클래스의 직접 객체화 불가
		
		// 추상 클래스를 상속받은 클래스는 직접 객체화 가능.
		Circle c = new Circle(10, 20, 30);
		c.draw();
		
		Rectangle r = new Rectangle(10, 20, 100, 500);
		r.draw();
		
		Point p = new Point(100, 200);
		p.draw();
		
		// Circle, Rectangle -> Shape 의 서브클래스
		// Point -> Shape 서브클래스가 아님(노관계)
		// Circle, Rectangle, Point -> Drawable 이라는 공통괸 인터페이스를 지니고 있다.
		
		Drawable objs[] = new Drawable[] {r, c, p};
		
		for (Drawable obj: objs) {
			if (obj instanceof Drawable) {
				// 특정 인스턴스가 Drawable 인터페이스의 구현인가?
				obj.draw();
			}
		}

	}

}
