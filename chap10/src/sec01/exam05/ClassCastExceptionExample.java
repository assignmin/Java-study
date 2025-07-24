package sec01.exam05;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		
		// Dog 객체 생성 후 메서드의 인자로 넣음
		Dog dog = new Dog();
		changeDog(dog);
		
		// Cat 객체 생성 후 메서드의 인자롤 넣음, 메서드 내부에서 Dog 객체로 형 변환 시도(런타임 에러 발생)
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog) {	// instanceof 연산자를 통해 매개값으로 받은 객체가 Dog 객체인지 확인
			Dog dog = (Dog) animal; 				//ClassCastException 발생 가능
		//} 
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

