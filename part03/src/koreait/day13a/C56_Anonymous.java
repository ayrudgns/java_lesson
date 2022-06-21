package koreait.day13a;

import koreait.day13.InterfaceA;
import koreait.day13.InterfaceB;

public class C56_Anonymous {			// 아 이게 무슨말이여~
	// 인터페이스 구현체(C56_Anonymous 클래스)를 익명 내부 클래스로 생성하기 : 1회용 클래스
	// (익명 클래스인 1회용 클래스는 현재 파일에서만 사용할 수 있다.)
	public static void main(String[] args) {
		
		InterfaceA ia = new InterfaceA() {		// 인터페이스 자체로는 객체 생성을 할 수가 없음.
												// 추상메소드 재정의해야함.
			@Override
			public int methodB(int num) {		
				System.out.println("i am anonymous !!");
				return 1234;
			}
			
			@Override
			public void methodA() {
				System.out.println("익명 InterfaceA methodA()");
			}
		};		// 까지 익명클래스.
		
	InterfaceB ib = new InterfaceB() {
		
		@Override
		public String name(String name) {
			
			return ("익명 내부 클래스 : " + name);
		}
	};		// 까지 익명클래스.
	
	ia.methodA();
	ia.methodD("하이 ~ 인터페이스");
	InterfaceA.methodC();	// static한 방법.
	System.out.println("상수 : " + InterfaceA.SIZE);	// static한 방법.
	System.out.println(ib.name("테스트"));
	}
}
