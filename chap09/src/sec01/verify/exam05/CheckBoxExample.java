package sec01.verify.exam05;

public class CheckBoxExample {
	public static void main(String[] args) {
		
		// CheckBox 객체 생성
		CheckBox checkBox = new CheckBox();
		// 인자로 BackgroundChangeListener 객체를 넘김
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		// 생성한 BackgroundChangeListener 객체의 메서드 호출(다형성)
		checkBox.select();
	}
}
