package koreait.day11;

public class ClassX extends ClassAbs{
	private int num;
	String r;
	
	// �߻�Ŭ������ ��ӹ��� �ڽ�(����)Ŭ������ �ݵ�� �߻�޼ҵ带 �������ؾ� �Ѵ�.
	@Override
	public void test() {			// �߻�޼ҵ带 ������. { }�� ä���� �߻�޼ҵ带 �������ؾ���.
		System.out.println("ClassX�� test()");		// �߻�޼ҵ� ������.
		System.out.println("num = " + num);			// �߻�޼ҵ� ������.
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void good(String r) {
		this.r = r;
	}
	
}
