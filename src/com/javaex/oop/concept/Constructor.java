package com.javaex.oop.concept;

public class Constructor {

	    String modelName;
	    int modelYear;
	    String color;
	    int maxSpeed;
	    int currentSpeed;

		// 생성자 (인스턴스 변수 값 초기화)
	    Constructor(String modelName, int modelYear, String color, int maxSpeed) {
	        this.modelName = modelName; // 메서드의 입력값으로 인스턴스 변수의 값을 지정
	        this.modelYear = modelYear;
	        this.color = color;
	        this.maxSpeed = maxSpeed;
	        this.currentSpeed = 0; // 입력값 없이 디폴트 초기화
	    }

	    String getModel() {
	        return this.modelYear + "년식 " + this.modelName + " " + this.color;
	    }
	}

