package koreait.day15;

public class GoClass3 implements Interface1{
	
	String str = "�ٺ�";

	public GoClass3() {
			System.out.println("���� Interface1�� ������ ����ü�Դϴ�.");
	}
	
	@Override
	public void run() {
		System.out.println("���� GoClass3�� �޼ҵ��Դϴ�.");		
	}
}
