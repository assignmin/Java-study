package sec01.exam10;

public class ClassExample {
	public static void main(String[] args) {
		
		// Car 클래스의 Class 객체 받기
		Class clazz = Car.class;

		// 현재 클래스와 같은 패키지에 있는 photo1.jpg 파일의 경로를 가져옴
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		
		// 현재 클래스 기준 하위 images 폴더에 있는 photo2.jpg 파일의 경로를 가져옴
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
