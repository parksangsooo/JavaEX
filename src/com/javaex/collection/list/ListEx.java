package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        // List 는(객체가 아님) 인터페이스 이다.
        List<String> lst = new LinkedList<>();

        // 객체 추가 : .add
        lst.add("Java");
        lst.add("C");
        lst.add("C++");
        lst.add("Python");

        System.out.println("lst = " +lst);

        // 객체 삽입
        lst.add(2, "C#");
        System.out.println("lst = " +lst);

        // 리스트는 "중복 삽입을 허용"
        lst.add("Java");
        System.out.println("lst = " +lst);
        System.out.println("size: " + lst.size());
        // System.out.println("capacity = " +lst.capacity());

        // 삭제 : Index 삭제
        lst.remove(2);
        // 객체의 삭제
        lst.remove("Python");
        System.out.println("lst= " + lst);

        // TODO: List 순회
        // 비워봅시다.
        lst.clear();
        System.out.println("lst= " + lst);

    }
}
