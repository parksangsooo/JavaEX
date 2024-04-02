package com.javaex.oop.person;

public class Person {
	private String name;
	private int age;
	
//	public Person() {
//		
//	}
//	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
		System.out.println("Inside Person Constructor");
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d\n", name, age);		
	}
	
//	public void showInfo(boolean bShow) {
//
//		String message = String.format("이름: %s, 나이: %d\n", name, age);
//						
//		System.out.println(message);
//}

}
