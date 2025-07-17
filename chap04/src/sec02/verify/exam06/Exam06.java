package sec02.verify.exam06;

public class Exam06 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 5; i++) {	//i가 1부터 5보다 작을 떄까지 i값을 1씩 증가하며 반복
			for (int j = 4; j > 0; j--) {	//j가 4부터 1보다 클 때까지 j값을 1씩 감소하며 반복
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
