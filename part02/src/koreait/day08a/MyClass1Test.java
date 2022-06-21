package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClass1Test {

	public static void main(String[] args) {
		// MyClass1의 객체 생성
		MyClass1 my = new MyClass1();		// public 클래스이지만 import 필요. ==> 패키지가 다름.
		
		// MyClass1 클래스의 필드 중 사용할 수 있는 것은?	답 : point
		//										ㄴ default(package) 한정자 필드 name, 메소드 setAge, getAge 사용 못함.
//		my.name = "momo";
		my.point = 1.234;
//		my.age = 23;				// 오류 : private 한정자 필드
//		my.setAge(23);
//		System.out.println("age = " + my.age);		// 오류 : private 한정자 필드
//		System.out.println("age = " + my.getAge());	
//		my.setAge(-100);
//		System.out.println("age = " + my.getAge());	
		System.out.println("point = " + my.point);		// public 한정자 필드
//		System.out.println("name = " + my.name);
		
		// Score 클래스 필드, 메소드의 한정자가 모두 default 이다.
		//		ㄴ new 객체 생성은?		class는 public 한정자이므로 생성된다.
		Score sc = new Score();		// but 객체 생성만 되고 아무것도 못한다..
	}
}

