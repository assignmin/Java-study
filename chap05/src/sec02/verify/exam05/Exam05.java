package sec02.verify.exam05;

public class Exam05 {
	public static void main(String[] args) {
		
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };	//2차원 배열 선언하면서 요소 대입

		int sum = 0;
		double avg = 0.0;

		int count = 0;
		for (int i = 0; i < array.length; i++) {	//array 배열 길이(행 수)만큼 반복
			for (int j = 0; j < array[i].length; j++) {	//array[i] 배열 길이(열 수)만큼 반복
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;	//강제 타입 변환 후 나눗셈 수행

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
