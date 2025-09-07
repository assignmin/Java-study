package sec01.exam02;

public class MemberExample {
	public static void main(String[] args) {
		
		// Member 객체 생성
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// obj1과 obj2 를 비교했을때 true 일 경우
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}
		else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		// obj1과 obj3 를 비교했을때 true 일 경우
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		}
		else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
	}
}
