package koreait.day08;

public class MyClass1 {
	
		private int age;		// �ڹ��� Ư�� : ���м�(��м�)�� Ŭ������ �ʵ尪�� �ٸ� Ŭ������ ���� �������� ���ϵ��� �մϴ�. (ĸ��ȭ : Encapsulation)
		String name;
		public double point;
		// private �ʵ�� setter, getter�� �־�� �ٸ� Ŭ�������� �� ����/�б⸦ �� �� ����. ==> ĸ��ȭ, ���м�, ���к��� ��� ����
		void setAge (int age) {			// setAge�� package ������
			if(age > 1 && age <=150) {	// age �ʵ尪�� �˻�
				this.age = age;		// age �ʵ�� ���� Ŭ���������� ����.
			} else {
				System.out.println("�߸��� ���Դϴ�.");
			}

		}

		int getAge() {			// getAge�� package ������
			return age;
		}
}


/*
	private int age;			// private  : �ٸ� Ŭ�������� ����� �� ����. ������, ��(���� Ŭ����)�� ����Ѵ�.
	String name;				// default(package)  : �ٸ� ��Ű������ ����� �� ����. �̿��̸� ���� ����.
	public double point;			// public   : ��𼭳� ����Ѵ�. ������, ������, ... �ٰ��� ����.

	private, default, protected(��ӿ��� ���), public�� 
	����(�ʵ�), �޼ҵ�, ������, Ŭ���� � ���Ǵ� �����������̴�. (Ŭ������ ���������� default, public�� ����Ѵ�.)
 */

