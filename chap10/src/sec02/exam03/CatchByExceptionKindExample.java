package sec02.exam03;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		
		// try 블록 실행 : 명령행 매개값이 제대로 들어왔는지, 숫자로만 이루어진 문자열인지 확인
		try {
			
			// args에 인자가 2개 이상 없다면, ArrayIndexOutOfBoundsException 예외 발생
			String data1 = args[0];
			String data2 = args[1];
			
			// data1이나 data2가 숫자로만 이루어진 문자열이 아니라면, NumberFormatException 예외 발생
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}
		catch(ArrayIndexOutOfBoundsException e) {	// 명령행 인자 수가 2개보다 적을 경우
			System.out.println("실행 매개값의 수가 부족합니다.");
		}
		catch(NumberFormatException e) {	// 숫자로 변환할 수 없을 경우
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		finally {	// 예외 발생 여부와 관계없이 항상 실행 (단, System.exit(0) 같은 종료 명령이 없을 경우)
			System.out.println("다시 실행하세요.");
		}
	}
}
