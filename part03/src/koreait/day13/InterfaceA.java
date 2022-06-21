package koreait.day13;

public interface InterfaceA {

// 오늘의 주제 : 인터페이스 (참고 : 클래스의 상속, 추상클래스의 추상메소드와 관련있는 내용)	
	
/*
 *	자바인터페이스의 특징
 *	1. 객체를 직접 생성하지 않는다.
 *	2. 필드는 상수만 있고, 인스턴스필드가 없다.		(public static final 생략)
 *	3. 추상메소드를 갖고 있다.    (public abstract 생략) 
 *	4. static 메소드와 인스턴스 메소드(반드시 키워드 default 사용)도 사용할 수 있다. (접근한정자 public만 가능!)
 *   
 *	자바 객체지향프로그래밍 특징 : 다형성. 인터페이스는 다형성 구현을 위한 또다른 대표적인 방법이다.
 *									ㄴ 일반 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다.
 *											ㄴ extends			ㄴ implements
 *	자바 라이브러리의 많은 클래스들이 인터페이스를 통해 구현되어 있고,
 *	자바 클래스들을 사용하기 위해 인터페이스의 특징을 이해해야 한다.
 *	인터페이스는 기능, 즉 메소드를 중심으로 참조 타입을 설정한다.	==> 기능 = 메소드 = 추상메소드!
 *	  ㄴ 같은 기능을 구현한 클래스이면 같은 인터페이스 타입으로 참조한다.
 */
	
		// 2. 상수 필드 : public static final이 생략되어 있다.
		int SIZE = 10;
		
		// 3. 추상메소드 선언 : pubic abstract가 생략되어 있다.
		void methodA();
		int methodB(int num);
		
		// 4. 접근한정자: public만 가능하다.
		static void methodC() {			// 정적인(static) 메소드
			System.out.println("나는 static 메소드 입니다.");
		}
		
		// 인터페이스를 사용하는 기존 애플리케이션과의 호환을 위해서
		// 추가적인 기능은 default 메소드로 정의해서 사용한다.
		
		default void methodD(String message) {	// 디폴트 메소드 (인스턴스 메소드와 유사함)
			System.out.println("수신된 메시지는 " + message +" 입니다.");
		}										// 목적 : 재정의를 위해서 만든다.
	
}