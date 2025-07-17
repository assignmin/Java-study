package sec03.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		
		// Dog 객체와 Cat 객체 생성 후 메소드 호출
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//변수의 자동 타입 변환(다형성, 하나의 타입으로 여러 타입을 사용)
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		//매개변수의 자동 타입 변환
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	// 메소드(매개변수는 추상클래스인 Animal 타입)
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
