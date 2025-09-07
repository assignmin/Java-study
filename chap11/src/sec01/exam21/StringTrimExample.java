package sec01.exam21;

public class StringTrimExample {
	public static void main(String[] args) {
		
		String tel1 = "  02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
		// 각 문자열에서 앞뒤 공백을 제거한 새로운 String 객체들의 연결
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
}

