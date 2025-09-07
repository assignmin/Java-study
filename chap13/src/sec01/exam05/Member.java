package sec01.exam05;

public class Member {
	
	public String name;
	public int age;
	
	public Member(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// equals 메서드 재정의
	@Override
	public boolean equals(Object obj)
	{
		// obj가 Member 인스턴스 인 경우 
		if(obj instanceof Member)
		{
			// 다운 캐스팅
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age) ;
		}
		else
		{
			return false;
		}
	}

	// hashCode() 메서드 재정의
	@Override
	public int hashCode()
	{
		// String 타입은 문자열 내용이 같으면, 같은 hashCode() 값을 갖도록 재정의 됨
		return name.hashCode() + age;
	}
}
