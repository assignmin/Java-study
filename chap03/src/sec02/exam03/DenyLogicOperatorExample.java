package sec02.exam03;

public class DenyLogicOperatorExample {
	public static void main(String[] args) {
		
		boolean play = true;
		System.out.println(play);

		play = !play;	//논리부정 연산자 사용(true를 false로)
		System.out.println(play);

		play = !play;	//논리부정 연산자 사용(false를 true로)
		System.out.println(play);
	}
}
