package sec03.exam03;

public class Car {
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 기본 생성자
	Car() {
	}
	
	// 매개변수 1개인 생성자
	Car(String model) {
		this.model = model;
	}
	
	// 매개변수 2개인 생성자
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 매개변수 3개인 생성자
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}


