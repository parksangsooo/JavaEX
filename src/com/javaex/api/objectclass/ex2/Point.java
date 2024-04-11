package com.javaex.api.objectclass.ex2;

// 두 객체의 내부 데이터의 값의 비교 equals 메서드
public class Point { // extends java.lang.Object 가 생략된 것
	// 필드작성
	private int x;
	private int y;

	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	// equals : 두 객체의 내부 데이터가 같음을 확인하는 메서드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			// 전달받은 obj 가 Point 인지 확인이 필요.
			// Obj -> Point 로 캐스팅
			Point other = (Point) obj;
			// 두 객체의 동등성
			// 두 객체의 x 필드가 같고, 두 객체의 y 가 같아야 동등하다.
			// return x == other.x && y == other.y;

			if (this.x == other.x && this.y == other.y) {
				return true;
			} else {
				return false;
			}
		}
		// obj 가 Point 가 아닐 경우.
		return super.equals(obj); // 아 나 잘 몰라 엄마 해줘.(부모에게 비교 방법을 위임)
	}

	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

}
