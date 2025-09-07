package sec03.exam03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		
		// 디렉터리 및 파일 객체 생성
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		// 디렉터리 및 파일이 존재하지 않으면 생성
		if(dir.exists() == false)
		{
			dir.mkdirs();	// 상위 경로까지 포함해 디렉터리 생성
		}
		if(file1.exists() == false)
		{
			file1.createNewFile();	// 새로운 빈 파일 생성
		}
		if(file2.exists() == false)
		{
			file2.createNewFile();	// 새로운 빈 파일 생성
		}
		if(file3.exists() == false)
		{
			file3.createNewFile();	// 새로운 빈 파일 생성
		}

		// "C:/Temp" 디렉터리의 내용(파일/디렉터리) 목록 가져오기
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("----------------------------------------------------------");
		// 파일의 마지막 수정 시간 포맷 설정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		// "C:/Temp" 폴더 내의 모든 파일과 디렉터리 정보를 출력
		for(File file : contents)
		{
			// 마지막 수정 시간 출력
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			// 디렉터리인 경우
			if(file.isDirectory())
			{
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			}
			// 파일인 경우
			else
			{
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
 			System.out.println();
		}
	}
}
