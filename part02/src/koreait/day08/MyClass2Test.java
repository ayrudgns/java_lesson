package koreait.day08;

public class MyClass2Test {
// �ϰ� ���� ���� �غ��� ==> MyClass2�� ��ü ����
	public static void main(String[] args) {
		
		// �⺻�����ڷ� ��ü �����ϱ�
		MyClass2 my2 = new MyClass2();	// ���� : Ŀ���һ����ڸ� �����ϸ� �⺻���� �� �� �ִ� �⺻�����ڸ� ����� �� ���� �ȴ�.
//											==> �̸� �ذ��ϱ� ���ؼ��� �⺻�����ڸ� ���� �����ϸ� �ȴ�.
		// Ŀ���һ����ڷ� ��ü �����ϱ�
		MyClass2 my22 = new MyClass2("���");
		
		System.out.println("my2.name = " + my2.getName());	
		System.out.println("my22.name = " + my22.getName());
		System.out.println();
		
		System.out.println("my2.getAge = " + my2.getAge());
		System.out.println("my22.getAge = " + my22.getAge());
		my2.setAge(23);
		System.out.println("my2.getAge = " + my2.getAge());
		my22.setAge(28);
		System.out.println("my22.getAge = " + my22.getAge());
		
		// my2 ��ü�� �⺻�����ڸ� ����ϸ� name �ʵ尪 �ʱ�ȭ�� �� �� ����. (���� ������ ���)
		
		// �⺻�����ڸ� ������� �ʴ� ��ǥ���� ����
//		Scanner sc = new Scanner();
	}
}
