package koreait.day09a;

import koreait.day09b.ClassAB;

public class C45_Test {
	public static void main(String[] args) {
		ClassAA test1 = new ClassAA();
		test1.ab = 123;			// test1이 참조하는 객체가 상속받은 필드
		test1.name = "hong";
		// C45_Test 클래스에서 ClassAA 타입의 객체를 만들었고, ClassAA는 ClassA를 상속받았기 때문에 가능하다.
		
		// 상속받은 메소드
		test1.print();
		
		// ClassAA에서 정의된 메소드
		test1.test();
		
		ClassAB test2 = new ClassAB();
		test2.test();
	}
}
