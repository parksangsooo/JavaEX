package com.javaex.oop.goods.v2;

// v2. 필드 접근자 Private
public class Goods {
	// 필드 선언
	// 인스턴스 영역
	private String name; // 상품명
	private int price; // 가격
	
	// Getter 와 Setter
	public String getName() {
		// 메서드 영역
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		// getter or setter 를 활용하면 무결성 체크,
		// 인증 체크 같은 로직을 수행가능.
		if (price <0 ) {
			this.price = 0;	
		} else {
			this.price = price;
		}
	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.printf("상품 이름: %s%n가격: %,d%n", name, price);
		}
}
