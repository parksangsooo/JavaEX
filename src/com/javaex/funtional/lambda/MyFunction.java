package com.javaex.funtional.lambda;

@FunctionalInterface    // 인터페이스가 함수형인지를 컴파일러에게 문의하는 명령어.
public interface MyFunction {
    // 함수형 인터페이스 - 내부에 반드시 1개의 메소드만 허용.
    int getResult(int x, int y);        // 인터페이스라 이놈은 추상메소드
    // 설계시에는 내부 로직을 미정 상태로 둔다
}
