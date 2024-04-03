package com.javaex.api.generic;


public class BoxApp {
    public static void main(String[] args) {
        // 내부에 오직 String 만 저장 가능한 상태.
        StringBox strBox = new StringBox();
        strBox.setContent("Generic");

        String retStr = strBox.getContent();
        System.out.println(retStr);

        // 내부에 오직 Integer 만 저장 가능한 클래스
        IntBox intBox = new IntBox();
        intBox.setContent(2024);

        Integer retInt = intBox.getContent();
        System.out.println(retInt);

        // 타입별로 처리할 수 있는 모든 객체를 만들어야 한다면?
        //  -> Object를 처리할 수 있는 객체를 만들면 모든 객체를 처리할 수 있는 만능클래스가 됨.

        // 모든 것을 다 담을 수 있는 객체
        ObjectBox objBox = new ObjectBox();
        objBox.setContent("Object Box");

        String obj = (String)objBox.getContent();   // 캐스팅의 불편함
        System.out.println(obj);

        objBox.setContent(2024);
        Integer objInt = (Integer)objBox.getContent();
        System.out.println(objInt);                 // 캐스팅의 불편함
        // 문제점
        //  1. Setter 에서 전달되는 매개변수의 타입을 제한 할 수 없다.
        //  2. 데이터를 받아올 때, 캐스팅이 필요하다(Object -> 실제 클래스로의 변환 필요)

        // String obj2 = (String)objBox.getContent();          // 캐스팅을 잘못하면 오류

        // GenericBox
        // 내부 데이터 타입을 외부에서 객체화하는 시점에서 결정
        GenericBox<String> genericStrBox = new GenericBox<>();
        //  -> 내부 데이터를 String 타입으로 결정
        genericStrBox.setContent("Generic Box");
//        genericStrBox.setContent(2024);     // 컴파일 시점에서 내부 입력 데이터 체크가 가능
        String objStr = genericStrBox.getContent();
        // 내부 저장 데이터가 지정 되어 있기 때문에 캐스팅이 필요없다.
        System.out.println(objStr);
    }
}
