package koreait.day15;

public class GoClass2 implements Interface2{
	
	public GoClass2() {
		System.out.println("���� Interface2�� ������ ����ü�Դϴ�.");
	}
	
	@Override
	public void ride() {
		System.out.println("���� GoClass2�� �޼ҵ��Դϴ�.");
	}
	
	public String talk2(int i) {
		return String.format("���� %d�� ���� ���� �� �־��.", i);
	}

}
