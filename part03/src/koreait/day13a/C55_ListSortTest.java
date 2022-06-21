package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;

public class C55_ListSortTest {
// sort�� ���õ� �������̽� ����ϱ�.
	
	public static void main(String[] args) {
		// List�� �������̽�, ArrayList�� List�� ����ü
		// ������ : List�� ����Ÿ������ �Ͽ� �����Ѵ�.
		// Why? ������ ���� �� ���̺귯������ List Ÿ������ ���� �Ǳ� �����̴�.
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		System.out.println("sort ���� : " + ilist);
		// ���� : ��������
		ilist.sort(null);		// ���ڷ� �ʿ��� ���� ����(Comparator) ����ü
								// �⺻���� String�� null�� �� �� �ִ�. (�������� �⺻)
		System.out.println("sort ���� : " + ilist);
		ilist.sort(Comparator.reverseOrder());		// reverse: ����, Comparator �������̽��� static �޼ҵ��̴�.
		System.out.println("�������� sort : " + ilist);
		System.out.println();
		
		slist.add("Ʈ���̽�");
		slist.add("�����̰�");
		slist.add("�������");
		slist.add("�����");
		slist.add("�ҳ�ô�");
		slist.add("�극�̺�ɽ�");
		
		System.out.println("sort ���� : " + slist);
		slist.sort(null);
		System.out.println("sort ���� (ASCEnding): " + slist);		// list�� ������ �ٲ��, ���� �ε����� �ٲ��.
		slist.sort(Comparator.reverseOrder());
		System.out.println("�������� sort (DESCending): " + slist);	// list�� ������ �ٲ��, ���� �ε����� �ٲ��.
		System.out.println();
		
//*************************************************************************
		System.out.println("1. Comparator �������̽��� ����ϴ� sort");
		
		List<Member> mlist = new ArrayList<>();
		
		mlist.add(new Member("momo", 23));
		mlist.add(new Member("nana", 27));
		mlist.add(new Member("nayeon", 25));
		mlist.add(new Member("dahyeon", 29));
		mlist.add(new Member("sooni", 26));
		mlist.add(new Member("jenny", 27));
		
		System.out.println("member ����Ʈ ���� : " + mlist);
//		mlist.sort(null);	// ���� : Member ��ü�� ���� �� ���� ��ü�̴�. ==> ���� �������̽��� ���ڷ� �ؾ���.
		// Member ��ü�� sort : �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü�� ������ �Ѵ�.
		System.out.println("================= ���ı��� : age =================");
		mlist.sort(new MemberAgeAscending());
		System.out.println("member sort Ȯ�� (ASC) : " + mlist);
		mlist.sort(new MemberAgeDescending());
		System.out.println("member sort Ȯ�� (DESC) : " + mlist);
		System.out.println("================= ���ı��� : name =================");
		mlist.sort(new MemberNameAscending());
		System.out.println("member sort Ȯ�� (ASC) : " + mlist);
		mlist.sort(new MemberNameDescending());
		System.out.println("member sort Ȯ�� (DESC) : " + mlist);
		System.out.println();
//*************************************************************************
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();
		System.out.println("2. Comparable �������̽��� ����ϴ� sort");
		
		List<User> ulist = new ArrayList<>();
		
		ulist.add(new User("���", 23));
		ulist.add(new User("����", 27));
		ulist.add(new User("����", 25));
		ulist.add(new User("����", 29));
		ulist.add(new User("����", 26));
		ulist.add(new User("����", 27));
		
		System.out.println("user ����Ʈ ���� : " + ulist);
		// User�� ���� �� �ִ� Ÿ���̴�. : Comparable ����ü
		System.out.println("================= ���ı��� : age =================");
		ulist.sort(null);
		System.out.println("user sort Ȯ�� (ASC) : " + ulist);		// ���̰� ���� ��, ����Ʈ�� �߰��� ������� �����Ѵ�.
		ulist.sort(Comparator.reverseOrder());
		System.out.println("user sort Ȯ�� (DESC) : " + ulist);
		/////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("�޼ҵ� ���ڷ� �͸�Ŭ������ �����ؼ� ��ü�� �����ߴ�.");
		ulist.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});		// �޼ҵ� ����(ulist.sort(~~)���� ~~�κ�)�� �͸�Ŭ������ �����ؼ� ��ü�� ����(new ���ñ�~)�ߴ�. ===> �ú�.. �����̿�
				// �׷� �̰� ��ȸ���̶� ���̰���?
		System.out.println("================= ���ı��� : name =================");
		System.out.println("user sort(name ASC) : " + ulist);

	}

}
