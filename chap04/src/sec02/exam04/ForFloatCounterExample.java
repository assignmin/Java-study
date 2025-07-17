package sec02.exam04;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		
		for(float x=0.1f; x<=1.0f; x+=0.1f) {	//부동소수점 숫자(float, double)는 이진수로 표현되기 때문에, 0.1 같은 십진수는 정확하게 표현 불가(x += 0.1f를 할 때마다 미세한 오차 누적 -> 1.0f에 도달하지 않거나 출력 값이 약간 달라질 수 있음)
			System.out.println(x);
		}
	}
}


