package sec02.verify.exam03;

public class CheckBoxExample {
	public static void main(String[] args) {
		
		// CheckBox 객체 생성
		CheckBox checkBox = new CheckBox();
		
		// 인자로 익명 객체를 넣음
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
			
			// 추상 메서드 재정의
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다.");
			}
		});
		
		// 메서드 호출
		checkBox.select();
	}
} 
