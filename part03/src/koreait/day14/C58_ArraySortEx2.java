package koreait.day14;

import java.util.Arrays;

public class C58_ArraySortEx2 {
	// �迭�� ����� ���� �����ϴ� ���� �����ϱ�.
	public static void main(String[] args) {
		String[] names = {"����", "����", "����", "�ź�", "����", "���"};
		String tmp;
		
		for(int i = 0; i < names.length - 1; i++) {
			for(int k = i + 1; k < names.length; k++) {
				if(names[i].compareTo(names[k]) > 0) {
					tmp = names[k];
					names[k] = names[i];
					names[i] = tmp;
				}
			}
		}
		System.out.println("String �迭 �������� ���� : " + Arrays.toString(names));
		
		for(int i = 0; i < names.length - 1; i++) {
			for(int k = i + 1; k < names.length; k++) {
				if(names[i].compareTo(names[k]) < 0) {
					tmp = names[i];
					names[i] = names[k];
					names[k] = tmp;
				}
			}
		}
		System.out.println("String �迭 �������� ���� : " + Arrays.toString(names));
	}

}
