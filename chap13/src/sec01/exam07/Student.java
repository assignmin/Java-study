package sec01.exam07;

public class Student {
	
	public int sno;
	public String name;
	
	public Student(int sno, String name)
	{
		this.sno = sno;
		this.name = name;
	}

	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj)
	{
		// obj가 Student 인스턴스인 경우
		if(obj instanceof Student)
		{
			// 다운 캐스팅
			Student student = (Student) obj;
			return (sno==student.sno) && (name.equals(student.name)) ;
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
		return sno + name.hashCode();
	}
}

