package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {
	public static void main(String[] args) {
		String message = "hi java!";		// message�� ������ ����
		
		String[] engKey = {"continue", "break", "public", "static", "dynamic"};
		
		// int, double, char �迭������ ��Ҹ� ��Ÿ���� nums[2], carr1[2], point[2]
		//											�� ��׵��� �⺻�� ������ Ÿ���̴�.
		// engKey �Ӹ� �ƴ϶� engKey[2]�� String ������ Ÿ��
		
		for(int i = 0; i < engKey.length; i++) {
			System.out.println(engKey[i]);		// engKey[i]�� String ������
		}
		System.out.println();
		
		String[] koreans = new String[5];		// �迭 ����� ���� �⺻�� ������ ������ �ƴ� �������̴�.
		for(int i = 0; i < koreans.length; i++) {
			System.out.println(koreans[i]);		// �⺻ �ʱⰪ�� null ==> �ƹ��͵� �������� ���� ����
		}
		System.out.println();
		
		System.out.println("1. engKey �迭 ��Ұ��� �����ϴ� ���ڿ��� ����");
		for(int i = 0; i < engKey.length; i++) {
			System.out.println(engKey[i] + ":" + engKey[i].length());		// engKey[i]�� String ������
		}
		
		koreans[0] = "����ϴ�";
		koreans[1] = "���ߴ�";
		koreans[2] = "������";
		
		System.out.println();
		System.out.println("2. koreans �迭 ��Ұ��� �����ϴ� ���ڿ��� ����");
		for(int i = 0; i < koreans.length; i++) {
			if(koreans[i] != null) {	// *** ������ ��Ұ� ������ ��� ���Ѵ�. ***
				System.out.println(koreans[i] + ":" + koreans[i].length());
			}
		// �����ϰ� �ִ� ��ü�� ���� �� �޼ҵ峪 �ʵ带 �����ϸ� ���� �߻� : koreans[3], koreans[4]�� null ����
		}
		
//		String temp = null;
//		System.out.println(temp.length());		// ���� : ������ �� ����.
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("static ��? >>> ");
		koreans[3] = sc.nextLine();
		System.out.print("dynamic ��? >>> ");
		koreans[4] = sc.nextLine();
		System.out.println();
		System.out.println("3. ��� �Էµ� koreans �迭 Ȯ��");
		for(int i = 0; i < koreans.length; i++) {
				System.out.println(koreans[i]);
		}
		System.out.println();
		System.out.println("4. ���ڿ� �迭���� ���ϱ�");
		// ����ڰ� �Է��� ���� �ܾ engKey �迭 �ε��� �������?
		System.out.print("ã�� �ܾ��? >>> ");
		String find = sc.nextLine();
/*		
		int index = -1;
		
		for(int i = 0; i < engKey.length; i++) {	// ���������� �����ϴ� ���ڿ� ��
			if(find.equals(engKey[i])) {		// ��ġ�ϴ� �ܾ ã���� for�� ����.
				index = i;
				break;
			}
		}
		System.out.println("ã�� �ܾ� ��ġ : " + index);
		if(index == -1) {
			System.out.println("ã�� �ܾ engKey�� �����ϴ�.");
		} else {
			System.out.println("�ѱ� �� : " + koreans[index]);
		}
*/
		
		int i;					// �ε����� ������� �ʰ� �ذ��ϱ�
		for(i = 0; i < engKey.length; i++) {
			if(find.equals(engKey[i])) {
				break;		// i = 0 ~ engKey.length - 1
			}
		}
		// break�� for�� �ߴ����� �ʰ� for�� ��� �������� ��, ���� ���ڿ��� �迭 engKey�� ����.
		
		System.out.println("ã�� �ܾ� ��ġ : " + i);
		if(i == engKey.length) {
			System.out.println("ã�� �ܾ engKey�� �����ϴ�.");
		} else {
			System.out.println("�ѱ� �� : " + koreans[i]);
		}
	}

}