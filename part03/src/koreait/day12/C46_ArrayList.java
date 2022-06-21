	package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {
	public static void main(String[] args) {
		int[] datas = {45, 23, 7, 21 ,19, 11, 44};		// �迭�� ������ �� �迭�� ũ�⸦ ���Ѵ�.
														// ũ��� �ٲ� ������. ��, ũ�Ⱑ �����̴�.
														// �迭�� �⺻�� ������ Ÿ���� int, double, long, ... �Ǵ� ������ Ÿ��
						
		ArrayList<Integer> list = new ArrayList<>();
						// ArrayList�� ũ�⸦ �ٲ� �� �ִ�. ��, ũ�Ⱑ �����̴�.
						// ������ Ÿ���� ������ Ÿ�Ը� �����ϴ�. �⺻�� Ÿ���� ����Ŭ������ ����Ѵ�.
						// <E>�� ���׸�(���ʸ�) Ÿ���̶�� �θ���. ������ ����� Ÿ���� ���Ѵ�. Generic(s)
						// generic : �������� // ��� Ÿ���� ����Ʈ�� ���� �� �ִٴ� �ǹ�.
						// ����Ʈ�� �����ϴ� �����͸� ���(Element)��� �Ѵ�.
						// �ֿ� �޼ҵ� : add, get, size, remove
		
		String[] names = {"����", "���", "�ź�", "����", "����"};
		ArrayList<String> name_list = new ArrayList<>();
		
		// ArrayList�� �����͸� �߰��� ���� add() �޼ҵ带 ����Ѵ�.
		list.add(45);
		list.add(7);
		list.add(21);
		list.add(19);
		list.add(11);
		list.add(44);
		
		System.out.println("ù��° ArrayList<Integer> ���");
		System.out.println(list);
		System.out.println("���� (�迭) " + Arrays.toString(datas) + ", �迭�� ũ�� : " + datas.length);
		System.out.println("list�� ũ�� : " + list.size());
		System.out.println();

		System.out.println("�ι�° ArrayList<String> ���");
		name_list.add("����");
		name_list.add("���");
		name_list.add("����");
		name_list.add("����");
		System.out.println(name_list);									// ������ ���� ��, []�� ���´�.
		System.out.println("name_list�� ũ�� : " + name_list.size());		// ������ ���� ��, 0���� ���´�.
		System.out.println();
		
		System.out.println("3. Ư�� ��ġ�� ������ �߰�");
		list.add(1, 23);		// (�ε��� ��ġ, �߰��� ��)
		System.out.println("add(1, 23) ��� : "  + list);
		name_list.add(2, "�ź�");
		System.out.println("add(2, \"�ź�\") ��� : " + name_list);
		System.out.println();
		
		System.out.println("4. �迭ó�� index ������ ������ ��������");
		System.out.println("get(3) : " + list.get(3));
		System.out.println("get(3) : " + name_list.get(3));
		System.out.println();
		
		System.out.println("5. Ư�� ��ġ�� ������(���) �����ϱ�");
		list.remove(4);
		System.out.println("remove(4) ��� : " + list);
		name_list.remove(4);
		System.out.println("remove(4) ��� : " + name_list);
		System.out.println();
		
		System.out.println("6. Ư�� ���� ��ġ�� �˾Ƴ��� (�ź�� ��� �ε���?)");
		System.out.println("�迭 : " + Arrays.binarySearch(names, "�ź�"));
		System.out.println("ArrayList : " + name_list.indexOf("�ź�"));
		System.out.println();
		
		System.out.println("7. 6���� ���� ������ for������ �Ѵٸ�?");	
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals("�ź�")) {
				System.out.println("�迭 : " + i);
				break;
			}
		}
		for(int i = 0; i < name_list.size(); i++) {
			if(name_list.get(i).equals("�ź�")) {
				System.out.println("ArrayList : " + i);
				break;
			}
		}
		System.out.println();
		// "�ź�" ��Ұ� �������� ��, ArrayList�� lastIndexOf �޼ҵ�� ������ ��ġ ��Ҹ� ã�� �� �ִ�.

		System.out.println("8. contains �޼ҵ�");
		System.out.println("'���'�� name_list�� �ִ°�? " + name_list.contains("���"));
		System.out.println("'����'�� name_list�� �ִ°�? " + name_list.contains("����"));
	}
}
/*
 *  �迭 : ���� ���� �����͸� �����ϴ� ���.
 *  �÷���(Collections) : �ڷᱸ��. ���� ���� �����͸� �����ϴ� ���̰�, �������� Ư¡�� ���� �����ϴ� �Ϳ� ���̰� �ִ�.
 *  																		�������� ����, �б� / ����
 *  					 ������ ���� / ���� ���� �˰����� �޼ҵ�� �����Ǿ� �ִ�.
 *  	�� ArrayList Ŭ����
 *  	�� HashMap Ŭ����
 */