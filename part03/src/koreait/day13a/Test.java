package koreait.day13a;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<TestSource> tsList = new ArrayList<TestSource>();
		
		tsList.add(new TestSource("������", 21));
		tsList.add(new TestSource("����", 3));
		tsList.add(new TestSource("�ູ", 18));
		tsList.add(new TestSource("��Ҹ�", 99));
		tsList.add(new TestSource("������", 50));
		
//		tsList.sort(null);
		System.out.println("tsList : " + tsList);			// Comparator �̿�
		System.out.println("==========================================================================================");
		tsList.sort(new tsListKorAscending());
		System.out.println("tsList �ѱ� �������� ���� : " + tsList);
		System.out.println("==========================================================================================");
		tsList.sort(new tsListKorDescending());
		System.out.println("tsList ������ �������� ���� : " + tsList);
		System.out.println();
		System.out.println("Comparable �غ���");
		System.out.println();
		
		List<TestSource> tssList = new ArrayList<TestSource>();
		
		tssList.add(new TestSource("������", 21));
		tssList.add(new TestSource("����", 3));
		tssList.add(new TestSource("�ູ", 18));
		tssList.add(new TestSource("��Ҹ�", 99));
		tssList.add(new TestSource("������", 50));
		System.out.println("tssList ���� : " + tssList);		// // Comparable �������̽� �̿�
		System.out.println("TestSource Ŭ������ compareTo() �޼ҵ忡�� ������ �ʵ带 �������� �������� ����");
		tssList.sort(null);
		System.out.println("�������� tsList : " + tssList);
		
	}

}

