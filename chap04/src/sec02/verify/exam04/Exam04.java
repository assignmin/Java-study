package sec02.verify.exam04;

public class Exam04 {
	public static void main(String[] args) {
		
		for (int x = 1; x <= 10; x++) {	//x가 1부터 10일 때까지 x값을 1씩 증가하며 반복
			for (int y = 1; y <= 10; y++) {	//y가 1부터 10일 때까지 y값을 1씩 즐가하며 반복
				if ((4 * x + 5 * y) == 60) {	//4와 x를 곱한 값과 5와 y를 곱한 값을 더한 값이 60이면
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
}
