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

class GoClass4 implements Interface1, Interface2 {		// �ϳ��� Ŭ���� ������ �������̽��� �����ϴ� Ŭ������ �߰��� ���� ���� public �ȵ�.
	
	@Override
	public void ride() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
