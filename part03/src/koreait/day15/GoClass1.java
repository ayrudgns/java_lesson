package koreait.day15;

public class GoClass1 implements Interface1{
	
	public GoClass1() {
		System.out.println("���� Interface1�� ������ ����ü�Դϴ�.");
	}
	
	@Override
	public void run() {
		System.out.println("���� GoClass1�� �޼ҵ��Դϴ�.");
	}
	
	public String talk1(int i) {
		return String.format("���� %d�� ���� ���� �� �־��.", i);
	}

}
