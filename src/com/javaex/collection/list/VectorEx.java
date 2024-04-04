package com.javaex.collection.list;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        // 벡터 선언
        // 모든 객채 (Object) 를 담을 수 있는 컬렉션 객체
        // .elementAt등 참조를 위해서 실제 클래스로 Casting 해야함.
        Vector v = new Vector(); // 기본 벡터 버퍼용량 10
        System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());

        for (int i = 0; i < 10; i++) {
            // 요소 추가
            v.addElement(i);    // auto boxing
        }


        // 허용량 초과
        v.addElement(10);
        System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());

        // 조회: elementAt(특정 위치에 있는 객체 참조)
        Integer val = (Integer)v.elementAt(5);  // elementAt -> Object 리턴 캐스팅 해야함
        System.out.println(".elemetAt(5): " + val);

        // 역 참조(검색) : 객체의 Index 조회
        System.out.println(".indexOf(5): " + v.indexOf(5));
        System.out.println(".indexOf(20): " + v.indexOf(20)); // 없는 객체는 -1

        // 객체 포함 여부: .contains
        System.out.println(".contains(7): " + v.contains(7));
        System.out.println(".contains(20): " + v.contains(20));

        // 삭제 : .removeElement
        v.removeElement(7);
        for (int i = 0; i < v.size(); i++) {
            Integer item = (Integer) v.elementAt(i);
            System.out.print(item + " ");

        }

        // Collection Framework 에서는 루푸의 개선이 필요.
        // TODO : 루프방식 개선필요.
        System.out.println();
        System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());

        // 버퍼 비우기
        v.clear();
        System.out.println("v= "+v);
        System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());

        // Generic 을 사용하여 코드 개선 가능해짐.
        // ..Ex) Number 를 상속한 모든 객체를 담을 수 있는 Generic 을 사용.

        // Vector<Integer> v2 = new Vector<>();        // 이 벡터 안에는 무조건 정수만 들어감. 내부 데이터 타입 FIX
        Vector<? super Number> v2 = new Vector<>();    // Number 상속받은 클래스만 저장

        v2.addElement(Integer.valueOf(2024));
        v2.addElement(Float.valueOf(3.1415f));
        // v2.addElement("vector");    // String 은 Number 를 상속 받지 않은 객체

        // TODO: 개선된 방식으로 루프 돌리기

    }
}
