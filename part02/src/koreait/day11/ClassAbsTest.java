package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {
	public static void main(String[] args) {
		
		Person momo = new Person();		// 가능함. (일반클래스)
//		ClassAbs abs = new ClassAbs();	// new 객체 생성 불가능. (추상클래스) ==> 추상메소드를 재정의하지 않았기 때문에.

		ClassAbs abs = new ClassX();		// 부모타입 참조	ClassX에서 추상메소드를 재정의했으니 가능함.
		ClassX cls = new ClassX();		// 구현한 클래스(자식클래스) 타입 참조	
		System.out.println("테스트 첫번째 : test 메소드");
		abs.test();		
		cls.test();
		abs.name = "손흥민";			// name은 부모클래스 필드
		cls.name = "모모";
		abs.print();				// print()는 부모클래스 메소드
		cls.print();
		System.out.println();
		
		System.out.println("테스트 두번째 : 자식 필드 num");
		cls.setNum(23);			// ClassX의 메소드. 문제될 것 없음.
		cls.test();				// 부모클래스 ClassAbs의 추상메소드. 문제될 것 없음.
//		abs.setNum();		// 오류 : ClassX의 메소드인 setNum()을 ClassAbs의 참조변수 abs로 사용하려고 함.
							//		 ㄴ 자식클래스의 메소드를 부모클래스의 참조변수로 사용하려고 하니 오류. 다운캐스팅 필요.
		cls.good("good");
//		abs.good("good");	// Line 25와 같은 맥락.
		
		ClassX x = (ClassX)abs;			// 다운캐스팅
		x.setNum(100);
		abs.test();
		x.good("good");					// 가능함. 다운캐스팅 했으니까.
//		x.test();			// abs.test();와 같은 기능을 한다.
		
	}

}
