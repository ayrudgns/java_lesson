package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {
	public static void main(String[] args) {
		// Member[] members = new Member[10];�� ����.
		ArrayList<Member> list = new ArrayList<>();	// list�� ����Ǵ� ���� '��ü�� ������'�̴�.
		
		list.add(new Member("���", 27));		// ���ο� ��ü�� �����ǰ�, �������� list�� �߰��Ѵ�.
		Member member = new Member("����", 26);		// ���ο� ��ü�� �����ǰ�
		list.add(member);							// �������� list�� �߰��Ѵ�.
		list.add(new Member("����", 20));
		list.add(new Member("�ź�", 22));
		System.out.println("���� list�� ��� ������ ? : " + list.size());
		System.out.println("1. list ��ü ���");
		System.out.println(list);
		// list.get(i) ==> Member ��ü�� �������� �����´�.
		System.out.println();
		
		System.out.println("2. list�� ��� �� ���� ��ü age �ʵ��� ���� 25 ������ �͸� ����غ���.");	// for�� Ȱ��
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getAge() <= 25) {
				System.out.println("i = " + i + ", " + list.get(i));
			}
		}
		System.out.println();
		
		System.out.println("3. '����'�� ��� �ε������� �����ϰ� �ִ� ��ü�ΰ�?");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals("����")) {
				System.out.println("i = " + i + ", " + list.get(i));
			}
		}
		System.out.println();
		
		// list�� ��Ұ� �������� �ʵ带 ���� ��ü�� ��, �ʵ尪�� ���ϴ� equals ����
		System.out.println("4. ����");
		// indexOf�� String Ŭ������ �⺻�� ����Ŭ������ �� �� �ִ�. 
		System.out.println("Member ��ü�� indexOf ���� : " + list.indexOf(new Member("����", 20)));
		// ����� : -1 (ã�� �� ����), ���� : �������� ���� ���� ã�µ�, �̸� �ʵ尪 �񱳸� ���� ã���� �ٲٴ�  ��� ������ �ʿ��ϴ�.
		// �̸��� ����, ���̰� 20�� ��Ҹ� ã�� ���� �� Ʋ�� �����̴�.
		
		System.out.println("Member ��ü�� indexOf ���� : " + list.indexOf(member));
		// ����� : 1, �������� ���� ���� ã�Ҵ�. (Line 11 ����)
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals("����") && list.get(i).getAge() == 20) {
				System.out.println("i = " + i + ", " + list.get(i));
			}
		}
		// �̸��� ����, ���̰� 20�� ��Ҹ� ã�� ���� �� �ùٸ� �����̴�.
		System.out.println();
	
	}
}