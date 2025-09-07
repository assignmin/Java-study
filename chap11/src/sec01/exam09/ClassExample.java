package sec01.exam09;

public class ClassExample {
	public static void main(String[] args) throws Exception {
		
		// Car 클래스의 Class 객체를 받는 방법 1
		Class clazz = Car.class;
		
		// Car 클래스의 Class 객체를 받는 방법 2
		// Class clazz = Class.forName("sec01.exam09.Car");
		
		// Car 클래스의 Class 객체를 받는 방법 3
		// Car car = new Car();
		// Class clazz = car.getClass();
		
		System.out.println(clazz.getName());	// 패키지를 포함한 클래스의 이름 출력
		System.out.println(clazz.getSimpleName());	// 패키지를 포함하지 않고 클래스의 이름 출력
		System.out.println(clazz.getPackage().getName());	// 클래스가 위치한 패키지 이름 출력
	}
}
