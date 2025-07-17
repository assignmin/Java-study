package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 15;
		if(v1>10) {
			int v2;			//if문 내부에 로컬변수 v2를 선언
			v2 = v1 - 10;	//v2에 값 대입
		}
		//int v3 = v1 + v2 + 5;	//v2는 if문 내부에서 선언된 로컬변수이므로 if문 바깥에서 사용 불가(컴파일 에러 발생)
	}

}
