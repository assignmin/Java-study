package sec04.exam01;

public class PrintfExample {
	public static void main(String[] args) {
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);	//value 출력
		System.out.printf("상품의 가격:%6d원\n", value);	//6칸 확보후, value가 6칸보다 작으면, 왼쪽의 남은 칸은 공백(6칸보다 클 경우, 그대로 출력)
		System.out.printf("상품의 가격:%-6d원\n", value);	//6칸 확보후, value가 6칸보다 작으면, 오른쪽 남은 칸은 공백(6칸보다 클 경우, 그대로 출력)
		System.out.printf("상품의 가격:%06d원\n", value);	//6칸 확보후, value가 6칸보다 작으면, 왼쪽의 남은 칸은 모두 0(6칸보다 클 경우, 그대로 출력)

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area); //10칸 확보후, area가 10칸보다 작으면, 소수점 셋째자리에서 반올림해서 둘째자리까지 출력(10칸보다 클 경우, 반올림만 해서 그대로 출력)
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}
}

