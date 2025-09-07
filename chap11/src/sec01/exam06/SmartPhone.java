package sec01.exam06;

public class SmartPhone {
	
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	// toString() 메서드 재정의
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
