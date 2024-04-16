package com.javaex.thread.synchronize;

// 객체를 공유하는 쓰레드 제작
public class User extends Thread {
    //필드 선언
    private SharedMemory memory;        // 공유 메모리 (임계영역)
    private int data;

    // 생성자
    public User(String name, SharedMemory memory, int data){
        this.setName(name);     // 쓰레드의 이름 정의
        this.memory = memory;
        this.data = data;
    }

    @Override
    public void run() {
        if (memory != null){
            memory.setMemory(data);
        }
    }
}
