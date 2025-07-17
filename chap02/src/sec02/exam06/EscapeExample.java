package sec02.exam06;

public class EscapeExample {
	public static void main(String[] args) {
		
		System.out.println("번호\t이름\t직업 ");	//'\t'는 탭(tab)
		System.out.print("행 단위 출력\n");			//'\n'은 새로운 줄(new line)
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");	//'\"'는 " 출력
		System.out.print("봄\\여름\\가을\\겨울");		//'\\'는 \ 출력
	}
}