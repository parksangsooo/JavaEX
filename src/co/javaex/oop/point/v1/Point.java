package co.javaex.oop.point.v1;

public class Point {
	
//	x, y 좌표를 나타낼 수 있는 필드 작성
	
	private int x;
	private int y;

//	x, y 좌표에 접근할 수 있는 getter/setter 메소드 작성
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int x) {
		this.y = x;
	}
	

	//	다음 실행 결과를 참조하여 draw()메소드 작성
	public void draw() {
		System.out.printf("점[x= %d, y= %d]을 그렸습니다.%n", x, y);
	}
	

}



