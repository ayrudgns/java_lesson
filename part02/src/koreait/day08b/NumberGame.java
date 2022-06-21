package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 7;		// �ִ� �õ�Ƚ�� 
		int[] triallst = new int[max];			// �õ��� ���� �迭�� ����	
		
		System.out.println("���� ���߱� ������ �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
		System.out.println("��, �޸��� ���纸����. (101 ~ 299)");
		int numComputer = r.nextInt(199) + 101;				// ��ǻ���� ���� ����
		int numHuman;										// �޸��� ���� �Է�
		int i = 0;
		
		do {
			System.out.print("������ ���� �Է� ( ��ȸ : " + (max - i) + " ) -> ");
			numHuman = sc.nextInt();
			
			if (numComputer > numHuman) {		// ���� > �Է°��̸�
				triallst[i] = numHuman;			// �õ��� ���� �迭�� �߰��ϰ�
				i++;							// �õ�Ƚ�� ī��Ʈ -1
				System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
			} else if (numComputer < numHuman) {		// ���� < �Է°��̸�
				triallst[i] = numHuman;					// �õ��� ���� �迭�� �߰��ϰ�
				i++;									// �õ�Ƚ�� ī��Ʈ -1
				System.out.println("�ƴմϴ�. �� ���� ���Դϴ�.");
			}
		
			if (i == max) {					// �õ�Ƚ���� �ִ� �õ�Ƚ���� �����ϸ�
				break;						// ����������
			}
		} while (numComputer != numHuman);	// ����� �Է°��� ���� ���� ���� ���
		
		if (i == max) {				// �õ�Ƚ���� �ִ� �õ�Ƚ���� �����ϸ�
			System.out.println("�� �޸� �Է� ���� : " + Arrays.toString(triallst));
			System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽ� �����ϼ���. ������ " + numComputer + "�Դϴ�.");
		} else {					// �õ�Ƚ���� �ִ� �õ�Ƚ���� �����ϱ� ���� ������ ���߸�
			System.out.println("������~ �����Դϴ�. �������� �õ� Ƚ�� : " + (i + 1));
		}
		
		sc.close();
	}

}
