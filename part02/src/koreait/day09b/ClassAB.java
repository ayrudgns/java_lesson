package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA {			// 다른 패키지이므로 ClassA를 import 해야 한다.
	// ClassAB 클래스가 필드, 메소드를 상속 받았는가? => ClassA의 private, default 접근한정자 요소는 상속받을 수 없다.
	
	public void test() {	// ClassAA에서의 test와 구분이 된다. ClassA를 상속받은 ClassAA, ClassA를 상속받은 ClassAB니까.
//		System.out.println("** name = " + name);		// name 필드 접근한정자는 default : 다른 패키지에서 사용할 수 없다.
		title = "momo";		// 상속받은 title 필드 : 다른 패키지이지만 protected 접근한정자로 자식클래스는 허용함.
		System.out.println("title = " + title);
		setName("신비");
		System.out.println("name = " + getName());
	}
}
