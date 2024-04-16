package com.javaex.thread.synchronize;

// ### 여러 쓰레드가 공유할 공유 메모리 (임계영역)
public class SharedMemory {
    // 필드 선언
    private int memory;

    // getter & setter

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {
        // 임계 영역 : 멀티 쓰레드 프로그램에서 단 하나의 쓰레드만 실행할 수 있는 코드 영역
        // synchronized 키워드를 이용해 임계영역을 선언할 수 있다.

        this.memory = memory;
        try {
            Thread.sleep(1000);         // 1초간 정지
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()
                + ": " + this.memory);     // 현재 쓰레드를 찾아서, 현재 이름(get name), 현재 메모리를 가지고 있는 해당 쓰레드(공유 메모리)의 MEMORY의 값을 출력
    }

}
