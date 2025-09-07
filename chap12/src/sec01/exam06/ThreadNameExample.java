package sec01.exam06;

public class ThreadNameExample {
	public static void main(String[] args) {
		
		// 현재 실행되고 있는 스레드 객체를 Thread 타입 변수에 대입
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		// 스레드 생성
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		// 스레드 실행
		threadA.start();
		
		// 스레드 생성
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		// 스레드 실행
		threadB.start();
	}
}
