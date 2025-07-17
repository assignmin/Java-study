package sec02.exam03;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		
		int[] arr1 = new int[3];	//3칸 int 타입 배열 생성(요소는 자동으로 모두 0으로 초기화)
		for(int i=0; i<3; i++) {	//0부터 3미만까지 i값 1씩 증가시키며 반복문 실행
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {	//0부터 3미만까지 i값 1씩 증가시키며 반복문 실행
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3];	//3칸 double 타입 배열 생성(요소는 자동으로 모두 0.0으로 초기화)
		for(int i=0; i<3; i++) {	//0부터 3미만까지 i값 1씩 증가시키며 반복문 실행
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {	//0부터 3미만까지 i값 1씩 증가시키며 반복문 실행
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];	//3칸 String 타입 배열 생성(요소는 자동으로 모두 null)
		for(int i=0; i<3; i++) {	//0부터 3미만까지 i값 1씩 증가시키며 반복문 실행
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {	//0부터 3미만까지 i값 1씩 증가시키며 반복문 실행
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}
}

