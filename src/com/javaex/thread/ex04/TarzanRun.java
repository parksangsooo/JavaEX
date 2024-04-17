package com.javaex.thread.ex04;

public class TarzanRun implements Runnable {
    /*
    러너블을 적용하고 있는 맥스라는 정수필드가 있고,
    그거를 이와 같이 생성자에서 변수로 받아서 지정해 주고 있음.
    그리고 이 run 메소드에는 가치를 10원씩 올려가면서 100번 노래를 부르는 메서드가 있음.

     */
    int max;
    public TarzanRun(int max) { this.max = max; }

    @Override
    public void run() {
        String lyric = "%s : 타잔이 %d원짜리 팬티를 입고 %d원짜리 칼을 차고 노래를 한다.";

        for (int i = 0; i < max; i++) {

            try {
                Thread.sleep(2000);
                System.out.printf(
                        (lyric) + "%n", Thread.currentThread().getName(),   // Thread 클래스에서 클래스 메소드로 현재 Thread의 인스턴트를 구한다음 그것의 이름을 가져오는 것.
                        i * 10, (i + 1) * 10
                );
            } catch (InterruptedException e) {
                 // 🛑
                System.out.println("네.");
                return;
            }
        }
    }
}