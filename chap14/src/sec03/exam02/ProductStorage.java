package sec03.exam02;

import java.util.*;

public class ProductStorage {
	
	private List<Product> list = new ArrayList<>();
	// 입력을 받기 위한 Scanner
	private Scanner scanner = new Scanner(System.in);
	private int counter;
	
	public void showMenu()
	{
		while(true)
		{
			System.out.println("--------------------------------");
			System.out.println("1.등록  |  2.목록   |  3.종료");
			System.out.println("--------------------------------");
			
			System.out.print("선택: ");
			// 메뉴 선택 입력받기
			String selectNo = scanner.nextLine();
			
			switch(selectNo)
			{
				case "1":
					registerProduct();	// 삼품 등록
					break;
				case "2":
					showProducts();		// 상품 목록 출력
					break;
				case "3": 
					return;		// 프로그램 종료
			}
		}
	}
	
	// 상품 등록
	public void registerProduct()
	{
		try
		{
			Product product = new Product();
			product.setPno(++counter);	// 상품번호 자동 증가
			
			// 상품명 입력
			System.out.print("상품명: ");
			product.setName(scanner.nextLine());
			
			// 가격 입력
			System.out.print("가격: ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			// 재고 입력
			System.out.print("재고: ");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			list.add(product);
		}
		catch(Exception e)
		{
			System.out.println("등록 에러: " + e.getMessage());
		}
	}
	
	// 등록된 상품 목록 출력
	public void showProducts()
	{
		for(Product p : list)
		{
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
		}
	}
}
