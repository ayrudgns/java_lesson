package koreait.day08;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
// https://blog.naver.com/jaeminkim90/222540932926 ==> ����Ƴ�;
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== ���� ���� ���߱� ���� ========");
		System.out.println("1. �÷��� | 2. �ְ� ��� ���� | 3. ����");
		System.out.print("��ȣ�� �Է��ϼ���. >>> ");
		int button = sc.nextInt();
		int num;				// �Է°�
		int score;				// ����
		
		if(button == 1) {
			int answer = r.nextInt(100) + 1;
			score = 1;
			do {
				System.out.print("���ڸ� ���纸����. >>> ");
				num = sc.nextInt();
				
				if(num > answer) {
					System.out.println("DOWN");
					score++;
				} else if (num < answer) {
					System.out.println("UP");
					score++;
				} if(num == answer) {
					System.out.println("�����Դϴ�!" + " ����: " + answer + ", �õ� Ƚ�� : " + (score - 1));
					System.out.println("������ " + score + "�� �Դϴ�.");
					break;
				}
			} while (num != answer);
			
		} else if (button == 2) {
			
		} else if (button == 3) {
			
		} 
		sc.close();
	}

}
