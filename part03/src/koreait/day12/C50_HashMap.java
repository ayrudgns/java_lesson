package koreait.day12;

import java.util.HashMap;

public class C50_HashMap {
/* 
 * ArrayList�� HashMap ���ϱ�!
 * 
 * ArrayList : 	������(�ε����� ����)���� �����͸� �����ϴ� �ڷᱸ���̴�. �迭�� �����ϴ�.
 * 
 * HashMap :	�������� ������ �ƴմϴ�. �ε����� ������� �ʰ� Key���� �̿��Ͽ� �����Ϳ� �����Ͽ� ����/�б� �Ѵ�.
 * 				*�˻�*�� ���� �˰��� �����ϴ�.
 * 				���ʸ� Ÿ���� K:Key, V:Value�� �ѽ��̴�.
 * 				Key�� Value�� ��� Ÿ���� �����ϴ�.
 * 				HashMap������ key�� value�� �� ������ ��Ҹ� �̷��.
 * 				value�� �˻��ϱ� ���ؼ� key�� ����Ѵ�.
 * 				HashMap�� ArrayList�� ���������� int, long, double �⺻�� Ÿ�� ��ſ� ����(wrapper)Ŭ������ ǥ���Ѵ�.
 */

	public static void main(String[] args) {
		// �Ĵ��� �޴���(�޴� �̸�, ����)�����͸� �����ϱ�
		String[] title = {"���İ�Ƽ", "������ũ", "������"};
		int[] price = {12000, 22000, 7000};
		
		// HashMap���� ����ٸ�?
		// key�� �޴� �̸�, value�� �������� �ϴ� HashMap �����ϱ�
		// key�� �ߺ��� ������ ����� �� ����. (������ ��)
		HashMap<String, Integer> menus = new HashMap<>();
		
		// ������ ���� : put() �޼ҵ�
		menus.put("���İ�Ƽ", 12000);
		menus.put("������ũ", 22000);
		menus.put("������", 7000);
		
		System.out.println("1. ����� ������ ���");
		System.out.println(menus);
		System.out.println();
		
		// ������ ����(�б�) : get() �޼ҵ�
		System.out.println("2. Ư���� key ���� value ���");
		System.out.println("'���İ�Ƽ' ����? " + menus.get("���İ�Ƽ"));
		System.out.println("'������ũ' ����? " + menus.get("������ũ"));
		System.out.println("'������' ����? " + menus.get("������"));
		System.out.println();
		
		//key ���� �ߺ��Ǹ�?
		menus.put("������", 8200);		// ���� ���? ==> ����� (value�� ����ȴ�.)
		System.out.println("����� : " + menus);
		System.out.println();
		
		// ������ ���� : remove() �޼ҵ�
		System.out.println("3. Ư�� ��� ����");
		menus.remove("������ũ");		// ���ڰ� key�� �� : key, value �� �� �ٷ� ������.
		System.out.println("���� ��� Ȯ�� : " + menus);
//		menus.remove("������", 6000);		// ���ڰ� (key, value)�� �� : key�� value�� ���� ��� ��ġ�ؾ� �����ȴ�.
		menus.remove("������", 8200);		// ���ڰ� (key, value)�� �� : key�� value�� ���� ��� ��ġ�ؾ� �����ȴ�.
		System.out.println("���� ��� Ȯ�� : " + menus);
	}

}
