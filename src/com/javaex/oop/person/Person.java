package com.javaex.oop.person;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
		System.out.println("Inside Person Constructor");
		System.out.printf("이름: %s, 나이: %d\n", name, age);		
	}
	
	public void showInfo(boolean bShow) {
		System.out.println("Inside Person Constructor");

		String message = String.format("이름: %s, 나이: %d\n", name, age);
						
		System.out.println(message);
}

}
