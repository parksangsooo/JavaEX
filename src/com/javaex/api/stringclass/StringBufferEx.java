package com.javaex.api.stringclass;

public class StringBufferEx {
    public static void main(String[] args) {
        // String 은 불변자료(immutable)
        // StringBuffer 는 내부에 버퍼(공간)을 두고, 버퍼에서 작업
        // 최종 소비되는 시점에서 문자열로 반환
        // 메모리 관리 측면에서 String 보다 유리함.

        // 버퍼 생성 (추가 append, 삭제 remove, 수정 replace ...)
        StringBuffer sb = new StringBuffer("This");
        System.out.println(sb);

        sb.append(" is pencil"); // 문자열 덧붙이기 : append
        System.out.println( sb );

        sb.insert(7, " my"); // 문자열 삽입 : insert
        System.out.println( sb );

        sb.replace(7, 10," your"); // 문자열 치환 : replace
        System.out.println( sb );

        sb.setLength(5); // 버퍼크기 조정
        System.out.println( sb );

        // 메소드 체이닝 : 메서드를 연속적으로 호출, 객체를 변화 시키는 방법.
        StringBuffer sb2 = new StringBuffer("this")
                            .append(" is pencil")
                .insert(7, " my")
                .replace(7, 10, " your");

        System.out.println(sb2);


    }
}
