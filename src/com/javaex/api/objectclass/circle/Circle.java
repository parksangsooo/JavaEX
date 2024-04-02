package com.javaex.api.objectclass.circle;

public class Circle {
    // 필드
    private int x;
    private int y;
    private double radius;

    // 생성자
    public Circle(int x, int y, double radius) {
    	super();
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // equals 메소드 재정의 (반지름이 같으면 동등하다.)
    @Override
    public boolean equals(Object obj) {

    	// 전달받은 obj 가 Circle 의 인스턴스인지 확인
        if (obj instanceof Circle) {
            
        	// obj 를 Circle 로 캐스팅
        	Circle other = (Circle) obj;
            
            // 두 Circle 객체의 반지름이 같으면 true 반환
            return this.radius == other.radius;
        }
        // 전달받은 객체가 Circle 이 아니라면 false 반환
        return false;
    }
    
    public String toString() {
    	return "Circle [x=" + x + ", y=" + y + ", radius="+radius+"] 입니다.";
    }
    
}
