package sec02.exam08;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		
		int[] oldIntArray = { 1, 2, 3 };	//배열 선언 후 요소 대입
		int[] newIntArray = new int[5];		//5칸짜리 배열 생성(요소는 모두 0)
		
		for(int i=0; i<oldIntArray.length; i++) {	//oldIntArray의 길이만큼 반복
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {	//newIntArray의 길이만큼 반복
			System.out.print(newIntArray[i] + ", ");
		}
	}
}