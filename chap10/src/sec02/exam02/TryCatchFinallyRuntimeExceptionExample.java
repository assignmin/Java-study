package sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		
		// try 블록 실행: 명령행 매개값이 제대로 입력되었는지 확인
		try {
			
			// args에 인자가 2개 이상 없다면, ArrayIndexOutOfBoundsException 예외 발생
			data1 = args[0];
			data2 = args[1];
		}
		catch(ArrayIndexOutOfBoundsException e) {	// args에 인자가 2개 이상 없을 경우
			
			System.out.println("실행 매개값의 수가 부족합니다.");
			return;
		} 
		
		// try 블록 실행: 입력된 문자열을 정수로 변환하고 덧셈 수행
		try { 
			
			// data1이나 data2가 숫자로만 이루어진 문자열이 아니라면, NumberFormatException 예외 발생
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}
		catch(NumberFormatException e) {	// 숫자로 변환할 수 없는 경우
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		finally {	// 예외 발생 여부와 관계없이 항상 실행 (단, System.exit(0) 같은 종료 명령이 없을 경우)
			System.out.println("다시 실행하세요.");
		}
	}
}

