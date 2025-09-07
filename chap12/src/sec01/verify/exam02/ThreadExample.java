package sec01.verify.exam02;

public class ThreadExample {
	public static void main(String[] args) {
		
		// Thread 구현 클래스로 스레드 생성 후 실행
		Thread thread1 = new MovieThread();
		thread1.start();
		
		// Runnable 구현 객체로 스레드 생성 후 실행
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
	}
}
