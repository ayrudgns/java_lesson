package koreait.day09a;

/*
 *  클래스의 상속
 *  ==> 클래스 간의 부모(상위클래스, super) - 자식(하위클래스) 관계가 만들어진다.
 *  ==> 부모의 클래스 구성요소를 자식이 사용할 수 있다. 상속되는 요소는 필드, 메소드
 *  ==> extends 키워드를 사용하여 부모클래스를 지정한다. 부모(super)클래스는 오직 1개이다.
 *  ==> private 접근한정자는 상속이 불가능하다.
 *  ==> protected는 다른 패키지의 자식클래스가 상속받을 수 있도록 한다.
 *  ==> 상속을 쓰는 이유?
 *  ==> 현실세계에서 반려동물샵을 운영한다고 할 때, 데이터 저장을 위해서 클래스를 정의해야 한다.
 *  ==> 동물의 종류는 다양하다. 다양한 동물들로 하나의 그룹을 만든다. (Animal 클래스 정의)
 *  ==> 그리고 공통적인 요소를 정의한다.
 *  ==> 공통적인 요소가 아닌 것은 다른 구체적인 클래스로 정의한다.
 *  ==> 그리고 Animal 클래스를 상속받는다.
 *  ==> 공통적인 요소가 있을 때, 이를 하나의 부모클래스로 만들고 필요한 경우 자손클래스에서 상속받아 활용한다.
 *  ==> 또는 접근한정자를 활용하고 싶을 때 상속을 통해 활용할 수 있다.
 */

public class ClassA {		// 부모클래스
	int ab;
	String name;
	protected String title;		
	// protected는 디폴트 접근한정자이지만, 자식클래스는 예외로 해당 필드를 사용할 수 있게 해줌.
	
	void print() {
		System.out.println("ab = " + ab);
		System.out.println("name = " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
		
}
