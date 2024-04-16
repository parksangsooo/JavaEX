package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		// Working Thread 수행
		DigitThread thread = new DigitThread();
		thread.setName("DigitThread");
		//	thread 시작
		//	-> .start() 메서드 호출
		// 쓰레드의 우선순위
		// 1 (MIN) ~ 5 (NOMAL) ~ 10(MAX)
		thread.setPriority(Thread.MAX_PRIORITY);
//		thread.start();
		
		//	Runnable 활용 쓰레드
		Thread runnableThread = new Thread(new AlphabetRunnable());
		runnableThread.setPriority(thread.MIN_PRIORITY);

		thread.start();
		runnableThread.start();

		// thread 와 runnableThread 의 흐름을 main 쓰레드의 흐름 합류(join())
		try{
			thread.join();
			runnableThread.join();
		}catch (InterruptedException e){
			e.printStackTrace();
		}

		System.out.println("MainThread 종료");
	}

}
