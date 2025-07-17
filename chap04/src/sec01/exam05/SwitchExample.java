package sec01.exam05;

public class SwitchExample {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1; //1부터 6 사이의 난수 하나 반환, Math 클래스의 random() 메소드는 0.0(포함 o) 부터 1.0(포함 x) 사이의 실수를 반환(0.0 <= 반환값 < 1.0)
		
		switch(num) {	//switch문에 넘겨지는 피연산자로 num을 대입
			case 1:	//1인 경우
				System.out.println("1번이 나왔습니다.");
				break;	//switch문 종료
			case 2:	//2인 경우
				System.out.println("2번이 나왔습니다.");
				break;	//switch문 종료
			case 3:	//3인 경우
				System.out.println("3번이 나왔습니다.");
				break;	//switch문 종료
			case 4:	//4인 경우
				System.out.println("4번이 나왔습니다.");
				break;	//switch문 종료
			case 5:	//5인 경우
				System.out.println("5번이 나왔습니다.");
				break;	//switch문 종료
			default:	//그 외의 경우
				System.out.println("6번이 나왔습니다.");
				break;	//switch문 종료
		}
	}
}
