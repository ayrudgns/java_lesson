package koreait.day07;

public class C35_GlobalVar {
	/*
	 *  [변수가 선언된 위치로 구분]
	 *  지역변수(local variable) : 메소드, for, if, while 등등 {}에서 선언된 변수. 블록을 벗어나면 변수 사용 불가능
	 *  전역변수(global variable) : 클래스{}에서 선언된 변수
	 *  
	 *  [전역변수를 static 여부로 구분]
	 *  ① 클래스이름.변수명
	 *  ② 객체를 만들어서 사용하는 this.변수명 (이때 변수는 인스턴스 변수) 
	 *  
	 *  전역변수는 클래스 또는 객체의 특성을 나타낼 때 '필드(field, 또는 프로퍼티, property)'라고 부른다.
	 */
	
	int count;			// 전역변수
	String message;
	static int num;
	static final int TEST = 9999;		// static final은 상수! 선언할 때 초기화하지 않으면 오류.
	static double point;
	
	public static void main(String[] args) {		// static은 객체를 생성하지 않고 그 자체로 쓰는 것. ** static은 static 끼리만 접근한다. **
		int num = 10;		// main 메소드에서만 사용
		System.out.println("num = " + num);		// 10
//		System.out.println("message = " + message);		// 오류 : static이 아닌 변수는 사용할 수 없음.
//		methodA();	// static이 아닌 메소드라서 오류 발생
		methodB();
	}
	
	public void methodA() {				// static 메소드가 아니므로 객체를 만들어서 사용하는 메소드
		int num = 99;		// methodA 에서만 사용
		System.out.println("num = " + num);		// 99
		System.out.println("message = " + message);		// 전역변수로 선언된 message
	}
	
	public static void methodB() {
		int num = 77;		// methodB 에서만 사용
		// 지역변수와 전역변수의 이름이 같은 경우, 지역변수를 가져온다.	(색으로 구분할 수도 있고, 마우스를 올려보면 알 수 있다.)
		System.out.println("num = " + num);		// 77
		System.out.println("num = " + C35_GlobalVar.num);		// Integer.BYTES와 같은 형태
		// 전역변수로 선언된 num. static일 때는 클래스이름.변수명 / static이 아닐 때는 this.변수명 
	}
	
	// *** 중요! ***
	public void methodC(int count) {
		this.count = count;		// this는 new 연산으로 만들어진 객체를 지칭한다. methodC 메소드를 실행시키는 객체.
	}
}
