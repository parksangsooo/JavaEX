package com.javaex.oop.concept;

public class ConstructorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor myCar1 = new Constructor("아반떼", 2016, "흰색", 250); // 생성자의 호출
    	Constructor myCar2 = new Constructor("제네시스", 2020, "검은색", 500); // 생성자의 호출
    	Constructor myCar3 = new Constructor("티코", 2003, "빨간색", 100); // 생성자의 호출

        System.out.println(myCar1.getModel()); // 2016년식 아반떼 흰색
        System.out.println(myCar2.getModel()); // 2020년식 제네시스 검은색
        System.out.println(myCar3.getModel()); // 2003년식 티코 빨간색

	}

}
