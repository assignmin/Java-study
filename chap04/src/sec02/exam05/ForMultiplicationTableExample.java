package sec02.exam05;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		
		for (int m=2; m<=9; m++) {	//m은 2부터 9일때까지 m을 1씩 늘리며 반복문 실행
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) {	//n은 1부터 9일때까지 n을 1씩 늘리며 반복문 실행(이중 for문)
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}

