package sec02.exam09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		
		String[] oldStrArray = { "java", "array", "copy" };	//String 타입 배열 선언하면서 요소 대입
		String[] newStrArray = new String[5];	//String 타입 5칸 배열 생성
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);	//System 클래스의 arraycopy 메소드(매개변수는 '복사받을 배열명', '복사받을 배열의 시작 인덱스'(어디부터 값을 넣을건지), '복사할 배열명', '복사할 배열의 시작 인덱스'(어디부터 값을 가져올건지), '복사할 길이')
		
		for(int i=0; i<newStrArray.length; i++) {	//newStrArray의 길이만큼 반복
			System.out.print(newStrArray[i] + ", ");
		}
	}
}