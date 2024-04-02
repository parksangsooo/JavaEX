package com.javaex.oop.goods.v4;

// v4. This 생성자
// 현재 자기 자신의 객체를 의미함.
// This() : 현재 Class 내부의 다른 생성자를 호출할 때 사용.
// this() 메소드는 같은 클래스의 다른 생성자를 호출할 때 사용하는 메서드이다.
// 주의할 점은 생성자 내부에서만 사용할 수 있다는 특징이 있다.
// this() 메소드에 인수를 전달하면, 정의되어 있는 다른 생성자를 찾아 호출해 준다.

public class Goods {
	// 필드 선언
	// 인스턴스 영역
	private String name; // 상품명
	private int price; // 가격
	
	
	// 생성자를 하나로 선언하지 않을 경우
	// 자바 컴파일러가 기본 생성자를 추가
	// 만약에 개발자가 생성자를 만들었을 경우 (기본 생성자는 추가되지 않는다.)
	
	// name 필드 생성자(초기화)
	public Goods(String name) {
		this.name = name;
		System.out.println("name 필드 초기화 생성자");
	}
	
	// 전체 필드 생성자
	
	public Goods (String name, int price) { // 생성자는 객체 초기화를 담당
		this(name); // -> Goods(String name) 생성자 호출
		this.price = price;
		System.out.println("전체 필드 초기화 생성자");
	}
		
	// Getter 와 Setter
	// Setter가 없으면 Read Only 필드 만들 수 있고
	// Getter & Setter 모두 없으면 프라이빗 필드가 된다. (절대 내부데이터 건드릴 수 없음)
	
	public String getName() {
		// 메서드 영역
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	
	// 일반 메서드
	public void showInfo() {
		System.out.printf("상품 이름: %s%n가격: %,d%n", name, price);
		}
}
