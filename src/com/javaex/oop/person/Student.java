package com.javaex.oop.person;

public class Student extends Person {
	
	private String school;
	
	
	public Student(String school) {
		this.school = school;
	}
	
	public Student(String name, int age, String school) {
		super(name, age); 	// 부모 생성자 호출
		this.school = school;
	}
	
	// getter & setter
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public void showInfo() {
		System.out.println("Inside Person Constructor");
		System.out.printf("이름: %s, 나이: %d\n 학교: %s\n", super.getName(), super.getAge(), school);
	}
	
//	@Override
//	public void showInfo(boolean bShow) {
//		System.out.println("Inside Person Constructor");
//
//		String message = String.format("이름: %s, 나이: %d\n", super.getName(), super.getAge(), school);
//		
//		message += bShow ? "그렸습니다." + message : "지웠습니다." + message;
//		
//		System.out.println(message);
//}
}
