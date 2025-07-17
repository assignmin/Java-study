package sec02.exam09;

public class  BreakOutterExample {
	public static void main(String[] args) throws Exception {
		Outter: 	//for문에 라벨을 붙여놓음
		for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;	//break 라벨명; 을 통해 중첩 for문을 한번에 종료
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}


