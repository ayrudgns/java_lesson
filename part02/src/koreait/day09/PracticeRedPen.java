package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class PracticeRedPen {
// ȥ�� �غ���!
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = 7;		// ���� ���� ���� ���� �� �ʱ�ȭ�Ͽ� �ڵ��� ������ �����ϰ� ��!!
		int max_size = MathProblem.MAX_SIZE;		// size �������� MAX_SIZE�� �ʰ��ϴ��� �˻� �߰��ϱ�.
		
		MathProblem[] problems = new MathProblem[size];
		// ��� ������ �����ϴ� �迭 : Ÿ���� MathProblem�̴�. �̰� ���� ������?	==> �����غ���.
		// �迭�� Ÿ���� MathProblem ��ü ������ : n1, n2, op, isCorrect
		// MathProblem Ŭ���� �ȿ� �ִ� ��ü��(n1, n2, op, isCorrect)�� ������ �� �ִ� Ÿ���̴�.
		// �����Ѵ�. ==> n1, n2, op, isCorrect �ʵ带 �����ϰ� �о�� �� �ִ�.
		// 22.06.08 ���� + ���� �� �����ϱ�.
		// problems[i]�� mp�� ���� �����ϱ� ���ؼ� �迭�� ����� ��. �ʿ��� ���� ������ �� �ִ�.
		// mp�� ���� problems[i]�� ���� �����Ѵ�.
	
		int ans;			// ������� �� �Է�
		int cnt = 0;		// ���� ���� ��
		
		System.out.println("=============================");
		System.out.println("   ������ ���� 2�ڸ� ���� ���� Ǯ��      ");
		System.out.println("=============================");
		System.out.println("�����մϴ�.");
		
		for(int i = 0; i < size; i++) {
			MathProblem mp = new MathProblem('+');
//			MathProblem mp2 = new MathProblem();		// �⺻�����ڰ� �ƴϹǷ� �̷��� ���� �ȵ�!
			mp.makeProb();		// n1, n2 ���� �����ؼ� �Է¹���.
			System.out.print("���� " + (i + 1) + ". " + mp.problem() + "�� �Է� >>> ");
			ans = sc.nextInt();
			if (ans == mp.showAnswer()) {		// ������ ���߸�
				cnt++;					// ���� ���� �� ����
				mp.setCorrect(true);	// isCorrect == true
			} 
			problems[i] = mp;			// mp ���� �迭�� �����ϱ�.
		}
		System.out.println("=============================");
		System.out.println("ä���մϴ�. ���� ���� " + cnt + " ( " + (cnt * 100 / size) + " �� )");
		System.out.println("::::::: Ʋ�� ���� ���� ���� :::::::");
		for(int i = 0; i < problems.length; i++) {
			if(!problems[i].isCorrect()) {		// mp.�� �ƴ� problems[i].���� ����. for������ ���� mp���� �޾����ϱ�.
				System.out.println("���� " + (i + 1) + ". " + problems[i].problem() + problems[i].showAnswer() );
			}
		}
		
		sc.close();		// ���α׷� ����
	}
}