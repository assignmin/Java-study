package sec02.verify.exam03;

public class OracleDao implements DataAccessObject  {
	
	// select() 추상 메소드 구현(오버라이딩)
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}

	// insert() 추상 메소드 구현(오버라이딩)
	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}

	// update() 추상 메소드 구현(오버라이딩)
	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
	}

	// delete() 추상 메소드 구현(오버라이딩)
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}
