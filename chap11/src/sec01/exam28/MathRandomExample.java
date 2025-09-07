package sec01.exam28;

public class MathRandomExample {
	public static void main(String[] args) {
		
		// 1부터 6까지 중 난수 하나 반환
		int num = (int) (Math.random()*6) + 1;
		System.out.println("주사위 눈: " + num);
	}
}
