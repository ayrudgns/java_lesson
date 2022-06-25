package koreait.day13;

// InterfaceA 클래스의 구현체(구현클래스, 실체)
public class MyClassX implements InterfaceA {		// 추상메소드 반드시 선언! (추상클래스와의 공통점)

	@Override
	public void methodA() {
		System.out.println("MyClassX methodA()");
	}
	
	@Override
	public int methodB(int num) {
		System.out.println("MyClassX methodB() " + num);
		return 999;
	}
	
}
