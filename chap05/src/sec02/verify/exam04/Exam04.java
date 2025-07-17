package sec02.verify.exam04;

public class Exam04 {
	public static void main(String[] args) {
		
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };	//int 타입 배열 선언하면서 요소 대입

		for (int i = 0; i < array.length; i++) {	//array 배열 길이만큼 반복
			if (max < array[i]) {
				max = array[i];
			}
		}

		System.out.println("max: " + max);
	}
}
