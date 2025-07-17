package sec01.exam04;

public class IfDiceExample {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1;	//1부터 6 사이의 난수 하나 반환, Math 클래스의 random() 메소드는 0.0(포함 o) 부터 1.0(포함 x) 사이의 실수를 반환(0.0 <= 반환값 < 1.0)
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {	
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}
