package sec02.exam03;

public class LongExample {
	public static void main(String[] args) {
		
		long var1 = 10;		
		long var2 = 20L;		
		//long var3 = 1000000000000;     //컴파일 에러 발생(숫자가 int 범위를 초과했으므로 ㅣ이나 L을 붙여서 컴파일러에 알려야함)
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	} 
}