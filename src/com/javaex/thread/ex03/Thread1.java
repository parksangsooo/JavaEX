package com.javaex.thread.ex03;

public class Thread1 extends Thread {
    /*
    쓰래드 클래스로부터 상속받는 나만의 클래스를 하나 만드는데,
    너는 하나의 쓰레드로 만들어 졌을 때, 너는 거기서 이런 일을 해라
    라고 정해주는 것
     */
    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            // 😴
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.print(1);
        }
    }
}
