package koreait.day13;

// InterfaceA Ŭ������ ����ü(����Ŭ����, ��ü)
public class MyClassX implements InterfaceA {		// �߻�޼ҵ� �ݵ�� ����! (�߻�Ŭ�������� ������)

	@Override
	public void methodA() {
		System.out.println("MyClassX methodA()");
	}
	
	@Override
	public int methodB(int num) {
		System.out.println("MyClassX methodB() " + num);
		return 999;
	}
	
}
