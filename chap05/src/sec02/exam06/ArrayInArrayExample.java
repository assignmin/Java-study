package sec02.exam06;

public class ArrayInArrayExample {
	public static void main(String[] args) {	
		
		int[][] mathScores = new int[2][3];	//2행 3열짜리 int 타입 2차원 배열 생성(요소는 모두 0)
		for(int i=0; i<mathScores.length; i++) {	//mathScores의 길이(행 수)만큼 반복(2)
			for(int k=0; k<mathScores[i].length; k++) {	//mathScores[i]의 길이(열 수)만큼 반복(3)
				System.out.println("mathScores["+i+"]["+k+"]="
						+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];	//2행짜리 int 타입 2차원 배열 생성
		englishScores[0] = new int[2];	//첫번째 행에 2칸짜리 배열 생성(요소는 모두 0)
		englishScores[1] = new int[3];	//두번째 행에 3칸짜리 배열 생성(요소는 모두 0)
		for(int i=0; i<englishScores.length; i++) {	//englishScores의 길이(행 수)만큼 반복
			for(int k=0; k<englishScores[i].length; k++) {	//englishScores[i]의 길이(열 수)만큼 반복
				System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
		System.out.println();		
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };	//2차원 배열을 선언하고 요소 대입
		for(int i=0; i<javaScores.length; i++) {	//javaScores의 길이(행 수)만큼 반복
			for(int k=0; k<javaScores[i].length; k++) {	//javaScores[i]의 길이(열 수)만큼 반복
				System.out.println("javaScores["+i+"]["+k+"]="
						+javaScores[i][k]);
			}
		}
	} 
}

