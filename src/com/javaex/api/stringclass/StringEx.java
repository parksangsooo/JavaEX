package com.javaex.api.stringclass;

public class StringEx {
    public static void main(String[] args) {
        // 문자열 기본


        // 문자열의 다양한 메소드


    }
    private static void stringBasic(){
        String s1 = "Java";     // 리터럴
        String s2 = new String("Java");     // 힙 메모리 상에 직접 객체 생성
        String s3 = "Java";     // 리터럴

        // 리터럴과 new 객체 생성이 다르게 작동.
        System.out.println(s1 == s2);       // 주소비교 : Literal vs new
        System.out.println(s1 == s3);       // Literal vs Literal
    }

}
