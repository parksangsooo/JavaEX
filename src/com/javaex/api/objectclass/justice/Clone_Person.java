package com.javaex.api.objectclass.justice;

//객체 복사 메소드를 사용하기 위해서는 Cloneable 인터페이스를 구현해서 clone을 재정의 해야함
public class Clone_Person implements Cloneable {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
