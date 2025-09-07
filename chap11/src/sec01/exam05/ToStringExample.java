package sec01.exam05;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		
		// Object 객체 생성
		Object obj1 = new Object();
		
		// Date 객체 생성
		Date obj2 = new Date();
		
		// toString() 은 기본적으로 객체의 정보를 문자열로 변환해서 반환
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}

