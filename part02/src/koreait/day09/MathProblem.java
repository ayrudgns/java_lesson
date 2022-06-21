package koreait.day09;

import java.util.Random;

public class MathProblem {
	// �ν��Ͻ� �ʵ� : static�� �ƴ� ����, ��ü�� ������ ������ �ٸ� ���� ���´�.
	private int n1;
	private int n2;
	private char op;		// ������ ( +, -, *, /, % )
	private boolean isCorrect;		// ����ڰ� �Է��� ���� �������� ���� Ȯ��, ������ �� true
	// isCorrect �ʵ� ��� ans �ʵ带 �߰��ؼ� ����ڰ� �Է��� ���� �����ϸ� ����ڰ� �Է��� ���� ��� ����.
	
	// static �ʵ�
	public static final int MAX_SIZE = 20;			// ������ �ִ� ������ 20��.
	
	
	// ############################## �޼ҵ� #############################
	public MathProblem (char op) {
		this.op = op;			// ���ڷ� ���޹��� ���� ������.
	}
	
	/*
	 *  !! ���� !!
	 *  static �޼ҵ�� �ν��Ͻ� �ʵ尪�� �����ϰ� �����ϴ� �޼ҵ��̴�. (��ü�� ������ ������ �ƴϴ�.)
	 *  �ν��Ͻ� �޼ҵ�� �ν��Ͻ� �ʵ尪�� ���õǾ� �����ϴ� �޼ҵ��̴�.
	 */
	
	public void makeProb() { 	// ��Ģ���� �������� ������ ���� �����ϱ� -> ������ ����� �ش�.
								// �ν��Ͻ� �޼ҵ� : ��ü�� �Ź� �ٸ��� ������ ������, �ν��Ͻ��� ����� �޼ҵ�
		Random r = new Random();
		int max1 = 0, min1 = 0, max2 = 0, min2 = 0;
		switch (op) {
		case '+':				// op���� '+'�� ��
			max1 = 99; max2 = 99; min1 = 11; min2 = 11;	// n1, n2 ��� 11 ~ 99
			break;						
		case '-':				// op���� '-'�� ��
			max1 = 99; max2 = 49; min1 = 50; min2 = 11;	// n1�� 50 ~ 99, n2�� 11 ~ 49
			break;										// �׻� n1 > n2 �̹Ƿ� ���� ����� ������ ������ �ʴ´�.
		case '*':				// op���� '*'�� ��
			max1 = 77; max2 = 29; min1 = 11; min2 = 11;	// n1�� 11 ~ 77, n2�� 11 ~ 29
			break;										// n1 > n2, ���� ������ ���� �ϱ� ���Ͽ� n2�� �۰� ��.
		case '/':				// op���� '/'�� ��
			max1 = 99; max2 = 29; min1 = 41; min2 = 11;	// n1�� 41 ~ 99, n2�� 11 ~ 29
			break;										// n1 > n2, ������ ������ ���� �ϱ� ���Ͽ� n2�� �۰� ��.

		}
		n1 = r.nextInt(max1 - min1 + 1) + min1;			// ���� ���� : min1 ~ max1
		n2 = r.nextInt(max2 - min2 + 1) + min2;			// ���� ���� : min2 ~ max2
	}
	
	public int showAnswer() {		// n1, n2, op �ʵ尪�� �����ͼ� ������ ����Ͽ� ��ȯ�Ѵ�.
									// ���������� �ν��Ͻ� �޼ҵ�.
		int result = 0;
	
		switch (op) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result= n1 / n2;
			break;
		}
		
		return result;
	}
	
	public String problem() {			// ������ �����ϴ� �ν��Ͻ� �޼ҵ�.
		return (n1 + " " + op + " " + n2 + " = ");
	}									// ����ϴ� �޼ҵ带 �� ���� �ʴ� ������
										// ����ϴ� �ڵ尡 �������� ���� �ֱ� ����.
										// ���� ��ɸ� �ϴ� �޼ҵ带 ����� ���� ����.

	
	// getter, setter ����� ( ���� Ŭ�������� setter�� ���� ����, �޼ҵ尡 ��ü�ϴϱ� )
	
	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public char getOp() {
		return op;
	}

	


}
