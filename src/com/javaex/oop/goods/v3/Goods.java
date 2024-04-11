package com.javaex.oop.goods.v3;

// v2. 필드 접근자 Private
public class Goods {
	// 필드 선언
	// 인스턴스 영역
	private String name; // 상품명
	private int price; // 가격
	
	
	// 생성자를 하나로 선언하지 않을 경우
	// 자바 컴파일러가 기본 생성자를 추가
	// 만약에 개발자가 생성자를 만들었을 경우 (기본 생성자는 추가되지 않는다.)
	
	public Goods (String name, int price) { // 생성자는 객체 초기화를 담당
		this.name = name;
		this.price = price;
	}
	
	

	
	// Getter 와 Setter
	// Setter가 없으면 Read Only 필드 만들 수 있고
	// Getter & Setter 모두 없으면 프라이빗 필드가 된다. (절대 내부데이터 건드릴 수 없음)
	
	public String getName() {
		// 메서드 영역
		return name;
	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		// getter or setter 를 활용하면 무결성 체크,
//		// 인증 체크 같은 로직을 수행가능.
//		if (price <0 ) {
//			this.price = 0;	
//		} else {
//			this.price = price;
//		}
//	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.printf("상품 이름: %s%n가격: %,d%n", name, price);
		}
}
