package sec02.verify.exam05;

public class Exam05 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 5; i++) {	//i가 1부터 5보다 작을 때까지 i값을 1씩 증가하며 반복
			for (int j = 1; j <= i; j++) {	//j가 1부터 i일 때까지 j값을 1씩 증가하며 반복
				System.out.print("*");
				if (j == i) {
					System.out.println();
				}
			}
		}
	}
}
