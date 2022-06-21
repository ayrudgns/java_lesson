package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 7;		// �ִ� �õ�Ƚ�� 
		int[] trialList = new int[max];			// �õ��� ���� �迭�� ����
		GameValue[] history = new GameValue[10];		// �ִ� 10�� ����� �����ϱ�
		int k = 0;								// history �迭�� �ε��� ����
		
		System.out.println("���� ���߱� ������ �����մϴ�.");
		System.out.print("������ �����Ϸ��� ��, �޸��� �̸��� ���ÿ�. >>> ");
		String gamer = sc.nextLine();
		int rmin = 11, rmax = 29;
		
		do {	// ���⼭����
			GameValue temp = new GameValue(gamer);
			System.out.println("���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
			System.out.println(String.format("��, �޸��� ���纸����. (���� : %d ~ %d)", rmin, rmax));
			int numComputer = GameValue.makeNumber(rmin, rmax);				// ��ǻ���� ���� ����
			int numHuman;										// �޸��� ���� �Է�
			int i = 0;
			
			do {
				System.out.print("������ ���� �Է� ( ��ȸ : " + (max - i) + " ) -> ");
				numHuman = sc.nextInt();
				
				if (numComputer > numHuman) {		// ���� > �Է°��̸�
					trialList[i] = numHuman;			// �õ��� ���� �迭�� �߰��ϰ�
					i++;							// �õ�Ƚ�� ī��Ʈ -1
					System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
				} else if (numComputer < numHuman) {		// ���� < �Է°��̸�
					trialList[i] = numHuman;					// �õ��� ���� �迭�� �߰��ϰ�
					i++;									// �õ�Ƚ�� ī��Ʈ -1
					System.out.println("�ƴմϴ�. �� ���� ���Դϴ�.");
				}
			
				if (i == max) {					// �õ�Ƚ���� �ִ� �õ�Ƚ���� �����ϸ�
					break;						// ����������
				}
				
			} while (numComputer != numHuman);	// ����� �Է°��� ���� ���� ���� ���
			
			if (i == max) {				// �õ�Ƚ���� �ִ� �õ�Ƚ���� �����ϸ�
					System.out.println("�� �޸� �Է� ���� : " + Arrays.toString(trialList));
					System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽ� �����ϼ���. ������ " + numComputer + "�Դϴ�.");
					temp.setCount(i);
			} else {					// �õ�Ƚ���� �ִ� �õ�Ƚ���� �����ϱ� ���� ������ ���߸�
					System.out.println("������~ �����Դϴ�. �������� �õ� Ƚ�� : " + (i + 1));
					temp.setCount(i + 1);
					temp.setSuccess(true);
			}
			// ������� ��� �ݺ�.
			
			// ���� ���� ���(GameValue ��ü�� ����)�� history �迭�� ����
			history[k] = temp;			// temp�� GameValue ��ü�� �������̴�.
			k++;			// ���� �ε�����, ī��Ʈ ����(������ Ƚ��)
			
			System.out.print("������ ����Ͻðڽ��ϱ�? ����Ϸ��� 0 �Է� >>> ");
		} while (sc.nextInt() == 0);
		
		System.out.println("::::::::::: ���� ���ھ� :::::::::::");
		// for������ history �迭�� ����� �� ����ϱ�
		for(int j = 0; j < k; j++) {
			history[j].print();			// history[j]�� Ÿ���� GameValue
		}
		System.out.println("::::::::::: The End :::::::::::");
		sc.close();
	}

}
