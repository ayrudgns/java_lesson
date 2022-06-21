package koreait.day08;

import java.util.Calendar;

public class MyClass3Test {
	public static void main(String[] args) {
		
//		MyClass3 my3 = new MyClass3();	// 오류 : 생성자  private 한정자이기 때문
		MyClass3 my3 = MyClass3.getInstance();		// 미리 만들어진 객체를 리턴 (항상 동일한 객체)
		my3.test();							// 객체의 인스턴스 메소드	: 객체를 1개만 만든다.
		MyClass3.staticTest();				// static 메소드	: 객체를 만들지 않는다.
		
		// 미리 만들어진 객체를 리턴해주는 Calendar 클래스 (예시)
		Calendar today = Calendar.getInstance();	// 캘린더 타입을 리턴해 줌. 미리 만들어진 객체를 리턴해준 것.
		System.out.println(today);
	}

}
