package koreait.day13;

public class C53_InterfaceTest {
	public static void main(String[] args) {
		MyClassX x1 = new MyClassX();
		MyClassY y1 = new MyClassY();
		MyClassZ z1 = new MyClassZ();
		
		InterfaceA x2 = new MyClassX();
		InterfaceB y2 = new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3 = new MyClassZ();
//****************************************************
		// 참조 타입에 따른 메소드 실행	(다중 구현체)	: z1, z2, z3이 어떤 메소드를 실행할 수 있는지?
		z1.methodA();		
		z1.methodB(23);	
		z1.methodD("z1쯔위D");
		z1.name("z1쯔위");
		// z1은 InterfaceA, InterfaceB를 둘 다 구현한 구현체 MyClassZ의
		// 참조 변수 타입이므로 문제가 1도 없다.
		System.out.println();
		
		z2.methodA();
		z2.methodB(1);
		z2.methodD("z2쯔위D");
//		z2.name("z2쯔위");			// 오류 : InterfaceB의 추상메소드로 실행할 수 없음.
		// z2는 객체는 MyClassZ로 생성했지만 참조 변수가 InterfaceA 타입이므로
		// InterfaceB의 추상메소드를 실행할 수 없다.
		System.out.println();
		
//		z3.methodA();				// 오류 : InterfaceA의 추상메소드로 실행할 수 없음.
//		z3.methodB();		
//		z3.methodD();	
		z3.name("nana");
		// z3는 객체가 MyClassZ이지만 참조 변수가 InterfaceB 타입이므로
		// InterfaceA의 추상메소드를 실행할 수 없다.
		
//****************************************************
		// 캐스팅(변수 또는 값의 타입 변환) : "다중 구현체"의 인터페이스 타입 캐스팅
		//		ㄴ MyClassZ는 InterfaceA와 InterfaceB 타입으로 모두 참조가 가능하다.
//		InterfaceB ib = z2;			// Type mismatch
		InterfaceB ib = (InterfaceB) z2;			// 상속이면 단일상속이라 불가능한 작업인데 interface는 다중구현이라서 가능함.
		ib.name("z2쯔위");	// 캐스팅 했으니 Line 26 실행 가능.
		
//		InterfaceA ia = z3;			// Type mismatch
		InterfaceA ia = (InterfaceA) z3;
		ia.methodA();		// 캐스팅 했으니 Line 30 ~ 32 실행 가능
		System.out.println();
//****************************************************
		// 다형성 구현의 예시
		iAmethod(x2);
//		iAmethod(y1);		// 오류 : 인자로 전달해야 하는 y1이 InterfaceA의 구현체가 아니기 때문이다.
		iAmethod(x1);
		iAmethod(z1);
		iAmethod(z2);
//		iAmethod(z3);		// 오류 : 변수 z3의 참조 타입이 InterfaceB이기 때문에 오류.
		System.out.println();
		
		iBmethod(y1);
//		iBmethod(x1);		// 오류 : 인자로 전달해야 하는 x1이 InterfaceB의 구현체가 아니기 때문이다.
		iBmethod(y2);
		iBmethod(z1);
//		iBmethod(z2);		// 오류 : 변수 z2의 참조 타입이 InterfaceA이기 때문에 오류.
		iBmethod(z3);
	}
	
//****************************************************
	// 다형성 구현의 예시 : 메소드의 인자 타입이 Interface
	public static void iAmethod(InterfaceA ia) {	// InterfaceA 구현체는 모두 인자로 전달받을 수 있다.
		ia.methodA();
	}
	
	public static void iBmethod(InterfaceB ib) {	// InterfaceB 구현체는 모두 인자로 전달받을 수 있다.
		System.out.println(ib.name("momo"));
	}

}
