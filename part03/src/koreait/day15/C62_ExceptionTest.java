package koreait.day15;

import java.util.Scanner;


// Throwable Ŭ������ ���� Ŭ���� : Error, Exception
// Error : ���� ���� ���α׷� �ܺ��� ����. �ý��� ���� ����. (HW(�ϵ����), OS(�ü��, Operating System), JVM, ...)
// Exception : ���� ���� ���α׷��� ���õ� ����. ���� �پ�~
public class C62_ExceptionTest {
/*
 * Exception ��� : ���� ������ �ƴ� �����ϸ鼭 �߻��ϴ� ���� (�߻����ɼ��� ����ؼ� ���α׷����ؾ� �Ѵ�.)
 * -> ���ο� ���� �ٸ� �̸� XXXXException�� �߻��ϰ�, �̵��� Exception Ŭ������ �ڽ� Ŭ�����̴�.
 * -> Exception�� ���� �߿� �߻��ϸ� �� ���Ĵ�?..... ���α׷��� �� �������� �ߴܵ�. 
 * ����, Exception�� �����ϰ� ���α׷��� �ߴܵ��� �ʵ��� ���α׷� ������ �ؾ��Ѵ�.
 */
	public static void main(String[] args) {
		
//		int a = 4.1;	// ��������
		
// Exception ���� 1 : java.lang.NullPointerException (��ü ������ null�̸� �޼ҵ带 ������ �� ����.)
//		String message = null;
//		char temp = message.charAt(0);		// message ���ڿ����� ù��° ����(0�� �ε���) 1�� ��������.
		
		
// Exception ���� 2 : java.lang.ArrayIndexOutOfBoundsException (�ε��� ���� ����!!)
//		int[] nums = new int[5];		// �迭 ���� : ��� 5��
//		nums[5] = 100;
		
// Exception ���� 3 : java.util.InputMismatchException (��Ű�� ��� �Է��� �Ӹ�)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է� >>> ");
//		int a = sc.nextInt();			// Ű���� �Է��� ������ ��ȯ�ؼ� ������ ���� 
//		System.out.println("����� �Է��� �� : " + a);
		
// Exception ���� 4 : java.lang.NumberFormatException (���� �ܿ� �ٸ� ���ڸ� �Է��ϸ� Exception �߻�)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է� >>> ");
//		int n = Integer.parseInt(sc.nextLine());
//		System.out.println("����� �Է��� �� : " + n);

		
	}

}


