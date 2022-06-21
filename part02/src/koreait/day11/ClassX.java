package koreait.day11;

public class ClassX extends ClassAbs{
	private int num;
	String r;
	
	// 추상클래스를 상속받은 자식(하위)클래스는 반드시 추상메소드를 재정의해야 한다.
	@Override
	public void test() {			// 추상메소드를 가져옴. { }를 채워서 추상메소드를 재정의해야함.
		System.out.println("ClassX의 test()");		// 추상메소드 재정의.
		System.out.println("num = " + num);			// 추상메소드 재정의.
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void good(String r) {
		this.r = r;
	}
	
}
