package com.javaex.thread.ex03;

import java.util.stream.IntStream;

/*
어떤 스레드를 재우려면 그 쓰레드 안에서  이 쓰레드의 클래스 메소드로 슬립을 해줘야 함
해당 쓰레드의 인스턴스에 재워버리는 건 안됨.
 */

public class WrongSleep {
    public static void main(String[] args) {
        Thread sleeper = new Thread(
                () -> IntStream.range(0, 5)
                        .forEach(i -> {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.println('쿨');
                        })
        );
        sleeper.start();

        try {
            //  ⚠️ sleeper 쓰레드를 재우려고 했지만
            //  - sleep은 정적 메소드!
            //  - 현 쓰레드가 자버림
            sleeper.sleep(1000);        // 쓰레드의 인스턴스에다가 슬립을 돌렸는데, 이 메인 쓰레드가 자버림.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("잘잤다!");
    }
}
