package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        // 스택 선언
        Stack<Integer> stack = new Stack<>();

        // 데이터 입력
        for (int i = 0; i < 10 ; i++) {
            stack.push(i);
            System.out.println("STACK: " + stack);
        }

        // 가장 마지막에 있는 데이터 확인
        System.out.println("PEEK: " + stack.peek());
        System.out.println("STACK: " + stack);

//        while (true){
//            System.out.println("POP: " + stack.pop());
//            System.out.println("STACK: " + stack);
//        }

        // Stack 비어있는지 확인해야 함.
        while (!stack.empty()){ // 비어있지 않으면 출력해라
            System.out.println("POP: " + stack.pop());
            System.out.println("STACK: " + stack);
        }
    }
}
