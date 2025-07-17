package sec05.verify.exam01;

public class ShopService {
	
	// 클래스 내부에서만 사용가능한 정적 ShopService 객체 생성
	private static ShopService singleton = new ShopService();
	
	// 생성자는 private로 선언(외부에서 호출 불가)
	private ShopService() {}
	
	// 생성된 ShopService 객체를 반환하는 정적 메소드
	static ShopService getInstance() {
		return singleton;
	}
}
