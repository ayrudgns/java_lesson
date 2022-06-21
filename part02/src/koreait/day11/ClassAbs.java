package koreait.day11;

/*
 * ## 추상클래스 ##
 * 1. 객체를 직접 생성하지 않는 형태의 클래스이다. 따라서, new 연산 불가능.
 * 2. 추상메소드를 갖고 있다. 추상(abstract): 구체화되지 않은 상태.
 * 3. 부모클래스에서 구체화되지 않은 추상메소드를 자식클래스가 재정의(오버라이드)하도록 하는 것이다.
 * 4. 비유를 하자면, '사람'은 추상화 개념이고, '손흥민'은 구체화된 실체이다.
 * 		ㄴ 추상클래스의 목적 : 추상화된 것은 객체를 만들지 않게 하기 위함.
 * 5. 추상메소드를 재정의(구현)한 자식클래스를 정의해서 객체를 생성한다.
 */
public abstract class ClassAbs {

	protected String name;		// 자식클래스는 다른 패키지에서도 직접 접근
	
	// 추상메소드: 자식클래스에서 재정의하도록 형식만 선언한다. ( { }(body, 몸체) 없음 )
	public abstract void test();
	
	
	// 인스턴스 메소드
	public void print() {
		System.out.println("name = " + name);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
