package com.javaex.oop.person;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("정우성", 45);
		p.showInfo();
		
		Student s1 = new Student("서울고등학교");
		s1.showInfo();
		
		Student s2 = new Student("이정재", 45, "한국고등학교");
		s2.showInfo();

	}

}
