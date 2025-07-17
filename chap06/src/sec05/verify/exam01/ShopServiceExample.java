package sec05.verify.exam01;

public class ShopServiceExample {
	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstance();	// 객체 받기
		ShopService obj2 = ShopService.getInstance();	// 객체 받기
		
		// 생성되어 있는 ShopService 객체는 하나뿐 이므로 같은 주소값을 가짐
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}
}
