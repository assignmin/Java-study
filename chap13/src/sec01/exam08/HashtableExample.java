package sec01.exam08;

import java.util.*;

public class HashtableExample {
	public static void main(String[] args) {
		
		// String을 각각 key와 value로 갖는 HashMap 인스턴스 생성 후, Map 타입 변수에 대입
		Map<String, String> map = new Hashtable<>();

		// 요소 추가
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		// 입력받기 위한 Scanner 인스턴스 생성
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디: ");
			// 입력받기
			String id = scanner.nextLine();
			
			System.out.print("비밀번호: ");
			// 입력받기
			String password = scanner.nextLine();
			System.out.println();
			
			// map의 key에 id가 존재하는 경우
			if(map.containsKey(id))
			{
				// 비밀번호가 일치하는지 확인
				if(map.get(id).equals(password))
				{
					System.out.println("로그인 되었습니다");
					break;
				}
				else
				{
					System.out.println("비밀번호가 일치하지 않습니다.");
				}				
			}
			else
			{
				System.out.println("입력하신 아이디가 존재하지 않습니다");
			}
		}
	}
}
