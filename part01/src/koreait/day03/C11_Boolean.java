package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {
	public static void main(String[] args) {
		boolean result;
		result = 10 > 5;
		System.out.println("10 > 5�� ��� : " + result);
		
		System.out.println("9 != 9�� ��� : " + (9 != 9));			//  ���� ���ѵ� ���Ϸ� �����?��� �ǹ��� �����
		System.out.println("9 == 9�� ��� : " + (9 == 9));			//  ���� ���ѵ� ���Ϸ� �����?��� �ǹ��� �����
		System.out.println();
		
		System.out.println("---������ ��� Ȯ���ϱ� : and---");
		System.out.println(" true and true = " + (true && true));		// true
		System.out.println(" true and false = " + (true && false));		// false
		System.out.println(" false and true = " + (false && true));		// false
		System.out.println(" false and false = " + (false && false));	// false
		// Dead code : 18, 19 Line�� ù��° ���� false�̹Ƿ� �ι�° ���� �� �ʿ䵵 ����.	==> �̹� ����� ��������.
		System.out.println();
		System.out.println("---������ ��� Ȯ���ϱ� : or---");
		System.out.println(" true or true = " + (true || true));		// true
		System.out.println(" true or false = " + (true || false));		// true
		System.out.println(" false or true = " + (false || true));		// true
		System.out.println(" false or false = " + (false || false));	// false
		// Dead code : 23, 24 Line�� ù��° ���� true�̹Ƿ� �ι�° ���� �� �ʿ䵵 ����.	==> �̹� ����� ��������.
		System.out.println();
		System.out.println("---������ ��� Ȯ���ϱ� : not---");
		System.out.println(" not true = " + !true);		// true ���� �ݴ�(not)������ �ٲ�, false
		System.out.println(" not false = " + !false);	// true
		System.out.println();
		
		int korean, math;		// ��������, ��������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� -> ");
		korean = sc.nextInt();
		System.out.print("���� ���� �Է� -> ");
		math = sc.nextInt();
		
		// ���������� ���������� ��� 80�� �̻��ΰ�? (and)	=> ����л�
		System.out.println("����л� ? " + (korean >= 80 && math >= 80));
		
		// �������� �Ǵ� �������� �߿� 90�� �̻��� �ִ°�? (or)	=> Ư���л�
		System.out.println("Ư���л� ? " + (korean >= 90 || math >= 90));
		
		// Quiz. ���������� 20 ~ 80�� �ƴ� �л����� ? => Ư���� �л� ( not ������ �̿� )
		System.out.println("Ư���� �л� ? " + !(korean >= 20 && korean <= 80));
		
		sc.close();
	}

}

/*
 * 	�������� �⺻ ���� : boolean�� true �Ǵ� false �� ���� ���� �����̴�. (Boolean ����Ŭ���� ������.)
 * 
 * 	���迬�� : == (����, ����), != (���� �ʴ�), >, < ,>=, <= ������ ������� boolean ����
 * 	������ : &&(and, ���ۻ���), ||(or, ��Ƽ�� ��), !(not, �ݴ븦 ����) ������ ������� boolean ����
 * 
 * 	���� : if, for ���� �ʿ��� ���ǽĿ� ���迬���� ���ȴ�.
 */
 