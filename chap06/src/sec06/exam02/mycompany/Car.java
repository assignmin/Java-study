package sec06.exam02.mycompany;

import sec06.exam02.hankook.*;	// 패키지의 클래스, 인터페이스 등 모두 import
import sec06.exam02.kumho.*;	// 패키지의 클래스, 인터페이스 등 모두 import
import sec06.exam02.hyndai.Engine;	// 패키지의 Engine 클래스 import

public class Car {
	
	// 필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// 패키지가 다르지만 클래스명이 같은 경우
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();	// hankook 타이어로 객체 생성(전체 패키지 구조 표기)
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();	// kumho 타이어로 객체 생성(전체 패키지 구조 표기)
}
