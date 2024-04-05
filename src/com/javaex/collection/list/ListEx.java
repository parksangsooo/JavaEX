package com.javaex.collection.list;

import java.util.Iterator;
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

        // TODO: List 순회(Set, List 순회시에는 Iterator 객체 사용
        System.out.println("------------------- Iterator");
        Iterator<String> it = lst.iterator();   // 반복자 추출

        while (it.hasNext()) {  // 뒤에 더 있음?
            String item = it.next();        // 요소 추출 후 다음으로 이동
            System.out.println(item + " ");
        }
        System.out.println();

        // 비워봅시다.
        lst.clear();
        System.out.println("lst= " + lst);

    }
}
