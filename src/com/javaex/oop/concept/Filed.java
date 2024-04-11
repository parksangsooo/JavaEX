//package com.javaex.oop.concept;
//
//public class Filed {
//	class FieldEx {
//	    static int classVar = 0; // 클래스/스태틱 변수 선언
//	    int instanceVar;     // 인스턴스 변수 선언
//	}
//
//	public class Member01 {
//	    public static void main(String[] args) {
//
//	        FieldEx myField1 = new FieldEx();   // 인스턴스 생성
//	        FieldEx myField2 = new FieldEx();   // 인스턴스 생성
//	        FieldEx myField3 = new FieldEx();   // 인스턴스 생성
//	        
//	        // 인스턴스 변수는 각 객체마다 개별적으로 저장된다
//	        myField1.instanceVar = 10;
//	        myField1.instanceVar = 20;
//	        myField1.instanceVar = 30;
//	  
//	        System.out.println( myField1.instanceVar ); // 10
//	        System.out.println( myField2.instanceVar ); // 20
//	        System.out.println( myField3.instanceVar ); // 30
//	        
//	        // 클래스(스태틱) 변수는 하나의 클래스의 값으로 공유되어 고정으로 저장된다
//	        myField1.classVar = 100;
//	        myField2.classVar = 200;
//	        myField3.classVar = 300;
//	        
//	        System.out.println( myField1.classVar ); // 300
//	        System.out.println( myField2.classVar ); // 300
//	        System.out.println( myField3.classVar ); // 300
//	        
//	        /* !! 위의 코드는 실행은 되지만 컴파일 경고를 내줄 것이다. !! */
//	        
//	        // 클래스 변수에 접근하려면 Field.classVar 식으로 클래스명으로 바로 접근 해야 된다
////	        System.out.println(Field.classVar ); // 300
//	    }
//
//	}
//}
