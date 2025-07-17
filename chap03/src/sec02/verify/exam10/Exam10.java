package sec02.verify.exam10;

public class Exam10 {
	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);	//"3.14"로 만든 후 double 타입으로 변환한 수와 연산 수행
		System.out.println("원의 넓이:" + var4);
	}
}
