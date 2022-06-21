package koreait.day08;

// �̷��� ��ü�� �����ϴ� Ŭ������ �ִ�.
public class MyClass3 {
	// �ʵ� Ÿ���� �ڱ� �ڽ��� Ŭ����
	private static MyClass3 my = new MyClass3();
	
	private MyClass3() {		// �����ڴ� private : �ٸ� Ŭ���������� new�� �������� �ʴ´�. (��ü ���� X)
		
	}
	
	public static MyClass3 getInstance() {		// ����Ÿ���� �ڱ� �ڽ��� MyClass3 Ÿ���̴�.
		return my;
	}
	
	public void test() {
		System.out.println("�̷��� ��ü�� �����ϴ� Ŭ������ ��ü�� ���� 1���� �����.");
	}
	
	public static void staticTest() {
		System.out.println("�� �޼ҵ�� ��ü�� ������ �ʰ� ����Ǵ�(��ü�� �������) static�Դϴ�.");
	}
}
