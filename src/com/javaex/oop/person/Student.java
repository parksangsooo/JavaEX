package com.javaex.oop.person;

public class Student extends Person {
	
	private String school;
	
	public Student(String name, int age, String school) {
		super(name, age); 	// 부모 생성자 호출
		this.school = school;
		System.out.println("Student 파라미터 3개");
	}
	
	public Student(String school) {
		super("",0);
		this.school = school;
		System.out.println("Student 파라미터 1개");
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
		super.showInfo();
		System.out.println("학교: " + school);
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
