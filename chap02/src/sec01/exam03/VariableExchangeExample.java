package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);	//x와 y의 값을 출력
		
		int temp = x;		//temp 변수를 선언하고 x의 값을 저장
		x = y;				//x에 y의 값을 대입
		y = temp;			//y에 temp의 값(변경전 x의 값)을 대입
		System.out.println("x:" + x + ", y:" + y);	//변경된 x와 y의 값을 출력

	}

}
