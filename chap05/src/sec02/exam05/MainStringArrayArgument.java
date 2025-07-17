package sec02.exam05;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		
		if(args.length != 2) {	//입력된 명령행 인자의 수가 2가 아니면
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);	//프로그램 종료
		}
		//명령행 인자에서 첫 번째 값과 두 번째 값을 각각 변수에 할당
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);	//문자열을 int 타입으로 변환
		int num2 = Integer.parseInt(strNum2);	//문자열을 int 타입으로 변환
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
