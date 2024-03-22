package co.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		// x, y 값을 입력받아 그려야 함.
		
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		p1.draw();
		p2.draw();
			
	}


}
