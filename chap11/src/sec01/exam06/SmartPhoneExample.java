package sec01.exam06;

public class SmartPhoneExample {
	public static void main(String[] args) {
		
		// SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		// toString() 반환 값을 String 타입 strObj에 대입
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		// 객체를 그냥 출력하면, 자체적으로 객체.toString() 으로 호출
		System.out.println(myPhone);
	}
}
