package koreait.day10;

public class PersonTest {
	public static void main(String[] args) {
		Person sinb = new Person();
		sinb.setName("�ź�");
		sinb.setAge(27);
		System.out.println(sinb);
		System.out.println(sinb.toString());	// toString() �޼ҵ带 ���������� ������
												// hashCode �� ��� : ��ü ������ ��
												// toString() �޼ҵ带 �����������ϱ�
												// �޼ҵ� ���.
		
		Person momo = new Person();
		System.out.println(momo);
	
	
	}

}
