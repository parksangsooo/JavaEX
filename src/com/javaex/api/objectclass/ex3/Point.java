package com.javaex.api.objectclass.ex3;

// 객체의 복제
// 얕은 복제 : 필드의 값만 동일하게 복제한 것(프리미티브 타입일 경우)
public class Point implements Cloneable {
    // Object 가 가진 clone() 메소드를 사용하려면, Cloneable 인터페이스를 구현 해야함.

    // 필드작성
    private int x;
    private int y;

    //생성자
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter & Setter 생성

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // equals : 두 객체의 내부 데이터가 같음을 확인하는 메서드
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;

            if (x == other.x && y == other.y) {
                return true;
            } else {
                return false;
            }
        }
        // obj 가 Point 가 아닐 경우.
        return super.equals(obj); // 아 나 잘 몰라 엄마 해줘.(부모에게 비교 방법을 위임)
    }
    // toString : 객체 정보를 문자열로 출력할 때 호출되는 메서드
    public String toString() {

        return "Point(" + x + "," + y + ")";
    }

    // 객체를 복제해서 새로운 Point 를 반환하는 메소드
    public Point getClone() {
        // 새로 생성된 Point 객체
        Point clone = null;

        // 복제 시도.
        // clone 메소드 변환 확인은 Object

        try {
            clone = (Point) clone();
        } catch (CloneNotSupportedException e) {
            // Clone 이 불가능 한 상황에 대한 예외 처리!!!
        }
        return clone;
    }

}
