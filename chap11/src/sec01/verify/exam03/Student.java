package sec01.verify.exam03;

public class Student {
	
	private String studentNum;
	
	public Student(String studentNum)
	{
		this.studentNum = studentNum;
	}

	public String getStudentNum()
	{
		return studentNum;
	}

	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj)
	{
		
		// obj가 Student 객체인지 확인
		if(obj instanceof Student)
		{
			
			Student student = (Student) obj;
			
			if(studentNum.equals(student.getStudentNum()))
			{
				return true;
			}
		}
		
		return false;
	}
	
	// hashCode() 메서드 재정의
	@Override
	public int hashCode()
	{
		return studentNum.hashCode();
	}
}
