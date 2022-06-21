package koreait.day09a;

public class ClassAA extends ClassA {	// super(부모)클래스는 ClassA

	double point;		// ClassAA의 필드
	
	// ClassAA의 인스턴스 메소드
	// name 필드를 상속받은 것으로, 여기서 선언한 것은 아니다. ==> 오류가 나지 않는 이유는 ClassA를 상속받았기 때문.
	void test() {
		setName("나연");	// name을 입력받는다.
		System.out.println("ClassAA의 인스턴스 메소드 test의 name = " + name);
	}
}

// 파일을 별도로 만들어서 테스트를 할 수도 있다. 단, public 클래스는 같은 파일에서 1개만.

