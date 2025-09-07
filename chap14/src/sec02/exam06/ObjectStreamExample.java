package sec02.exam06;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		
		writeList();
		List<Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		for(Board board : list)
		{
			System.out.println(
				board.getBno() + "\t" + board.getTitle() + "\t" + 
				board.getContent() + "\t" + board.getWriter() + "\t" +
				sdf.format(board.getDate())
			);
		}
	}
	
	public static void writeList() throws Exception
	{
		List<Board> list = new ArrayList<>();
		
		// 데이터 추가
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		
		// 객체를 파일에 출력하기 위한 스트림
		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// 리스트 객체 직렬화 후 파일에 기록
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<Board> readList() throws Exception
	{
		// 객체를 파일에서 입력받기 위한 스트림
		FileInputStream fis = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// 역직렬화를 통해 List<Board> 객체 복원
		List<Board> list = (List<Board>) ois.readObject();
		
		return list;
	}
}
