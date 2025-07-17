package sec02.verify.exam03;

public class DaoExample {
	
	// 매개변수로 DataAccessObject 타입의 객체 받는 메소드
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	// main 메소드
	public static void main(String[] args) {
		
		// OracleDao 객체와 MysqlDao 객체를 인자로 넘겨 메소드 호출
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}

