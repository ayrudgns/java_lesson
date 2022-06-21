package koreait.day15;

public interface Interface1 {
	
	int num1 = 30;
	
	void run();
	
	static void methodWhat() {	// 정적인 메소드는 body 채울 수 있음.
		
	}
	
//	default void methodWhere() {	// 디폴트 메소드 가능
//									// 기존 애플리케이션과의 호환을 위해서 추가적인 기능은 default 메소드로 정의해서 사용한다.
//	}								// 즉, 얘는 추가적인 기능을 정의하고 싶을 때 사용함.

}
