package sec01.verify.exam05;

public class BackgroundChangeListener implements CheckBox.OnSelectListener {
	
	@Override
	// 추상 메서드 재정의
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}
}
