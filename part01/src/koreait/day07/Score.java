package koreait.day07;

import java.util.Scanner;

// C40 ��ȣ ����
public class Score {		// ���� �Է¹ް�, �հ�� ����� ���ϰ� ������ ���� �˷��ִ� Ŭ����
	
	int korean;
	int english;
	int science;
	
	void input() {		// ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� >>> ");
		this.korean = sc.nextInt();
		System.out.print("���� >>> ");
		this.english = sc.nextInt();
		System.out.print("���� >>> ");
		this.science = sc.nextInt();
		// sc.close() // ������ ���α׷��� ����ɶ��� �ؾ���.
	}
	
	int sum() {				// ������ �հ�
		return (korean + english + science);
	}
	
	double avg() {			// ������ ���
		return (double)sum() / 3;
	}

	@Override
	public String toString() {
		return "[korean = " + korean + ", english = " + english + ", science = " + science + "]";
	}
	
}
