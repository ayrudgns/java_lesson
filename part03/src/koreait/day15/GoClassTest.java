package koreait.day15;

public class GoClassTest {
	public static void main(String[] args) {
		
		Interface1 i1 = new GoClass1();
		Interface2 i2 = new GoClass2();
		Interface1 i3 = new GoClass3();
		Interface1 i4 = new GoClass4();
		Interface2 i5 = new GoClass4();
		
		
		
	}

}

class GoClass4 implements Interface1, Interface2 {		// 하나의 클래스 내에서 인터페이스를 구현하는 클래스를 추가로 만들 때는 public 안됨.
	
	@Override
	public void ride() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
