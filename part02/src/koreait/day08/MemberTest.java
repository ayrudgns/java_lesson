package koreait.day08;

public class MemberTest {
	public static void main(String[] args) {
		
		Member momo = new Member();		// �� ���·� �����ص� ��¹� ����. ��ü ����鼭 ��ɹ� ����Ǳ� ����.
		System.out.println();
		
		Member nana = new Member("����", "nana@gmail.com");
		System.out.println("nana name = " + nana.getName());
		nana.setAge(26);
		System.out.println("nana age = " + nana.getAge());
		System.out.println("nana email = " + nana.getEmail());
		
	}

}
