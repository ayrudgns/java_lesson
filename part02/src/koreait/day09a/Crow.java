package koreait.day09a;

public class Crow extends Animal{	// ���
	
	protected int wings;	// ���� ��� ���� : default ������(���� ��Ű��) + �ٸ� ��Ű���� �ڽ�Ŭ����
	
	public Crow() {
		System.out.println("���ο� ���� ������ crow");
	}
	
	public void fly() {
		setName("���");
		setColor("������");
		System.out.println("Ư¡ : ����");
	}
}
