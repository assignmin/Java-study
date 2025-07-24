package sec01.exam04;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		// 문자열을 숫자로 변환(data2의 문자열은 숫자로만 이뤄져있지 않음 -> NumberFormatException(런타임 에러) 발생)
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}

