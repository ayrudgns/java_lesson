package koreait.etc;

import java.util.Scanner;

public class BinaryTest2 {
	public static void main(String[] args) {
		
		int n10 = 123;		// 10���� ǥ��
		int n16 = 0xa41c;	// 16���� ǥ��, 0x�� �����Ѵ�.
		int n2 = 0b1010010000011100;	// 2���� ǥ��, 0b�� �����Ѵ�.
		
		System.out.println("1. ������ �״�� ����ϱ�");
		System.out.println("10���� ���ͷ� 123 : " + n10);	// ������ ����� format�� ������ ���� ���
		System.out.println("16���� ���ͷ� 0xa41c : " + n16);	// 10������ ��µȴ�.
		System.out.println("2���� ���ͷ� 0b1010010000011100 : " + n2);
		System.out.println();
		
		System.out.println("2. format �����Ͽ� 16���� ����ϱ�");
		System.out.println(String.format("16���� ���ͷ� 0xa41c : %x", n16));	// 16���� ���� %x
		System.out.println(String.format("2���� ���ͷ� 0b1010010000011100 : %x", n2));
		System.out.println(String.format("10���� ���ͷ� 42012 : %x", 42012));
		// ��� : 10���� 42012, n16�� n2 �������� �޸𸮿� ����� ���� ��� ������ 0, 1 ǥ�����̴�.
		System.out.println();
		
		System.out.println("3. -1�� 2����, 16���� ǥ�� Ȯ���ϱ�");
		System.out.printf("-1�� 16���� : %x\n", -1);
		System.out.println("-1�� 2���� : " + Integer.toBinaryString(-1));
		System.out.println();
		
		System.out.println("4. �Է��� 2���� �Ǵ� 16���� ���� 10���� ������ �ٲٱ�");
		Scanner sc = new Scanner(System.in);
		System.out.print("2���� �� �Է� >>> ");
		String t2 = sc.nextLine();
		System.out.print("16���� �� �Է� >>> ");
		String t16 = sc.nextLine();
		
		// ���ݱ����� �ַ� Integer.parseInt(s)�� ǥ���߰�, �ǹ̴� s ���ڿ��� 10���� ǥ���̶�� �ǹ��̴�.
		System.out.println(String.format("2���� %s�� 10���� %d�Դϴ�.", 
				t2, Integer.parseInt(t2, 2)));			// t2�� 2�����̴�. (�˷���) => �޼ҵ� ����� ������
		System.out.println(String.format("16���� %s�� 10���� %d�Դϴ�.", 
				t16, Integer.parseInt(t16, 16)));		// t16�� 16�����̴�. (�˷���) => �޼ҵ� ����� ������
				// ������ (-)��ȣ�� �Ἥ ������ ���� �ʴ� ���� ������ ���ڿ��� �Է��ؾ� �Ѵ�.
				// �ִ� ���� �Է°��� -7fffffff
	
	}

}
/*
 *  <<���>>
 *  n�� 2(Binary), 8(Octal), 16(Hex)�� �����ϴ�.
 *  n���� ���ڿ� -> 10���� ������ ��ȯ : Integer.parseInt(���ڿ�, n)
 *  10���� ������ -> n���� ���ڿ� : Integer.toBinaryString �޼ҵ�, toOctalString �޼ҵ�, toHexString �޼ҵ�
 *  
 *  format���� %d�� 10����, %x�� 16����, %o�� 8����, 2������ ���� ������ ����.
 *  
 *  2������ ��Ʈ ���� : &, |, ^, ~, >>, << ���... ������ test
 *  
 */
