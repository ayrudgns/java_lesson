package koreait.day02;

public class C03_IntegerData {
	public static void main(String[] args) {
		
		System.out.println("Byte ���������� ---------");
		System.out.println("�޸� ũ�� : " + Byte.BYTES + " ����Ʈ");			// Ŭ����.�޼ҵ�
		System.out.println("Byte ������ �ּڰ� : " + Byte.MIN_VALUE);
		System.out.println("Byte ������ �ִ� : " + Byte.MAX_VALUE);
		System.out.println();
		System.out.println("Short ���������� ---------");
		System.out.println("�޸� ũ�� : " + Short.BYTES + " ����Ʈ");	
		System.out.println("Short ������ �ּڰ� : " + Short.MIN_VALUE);
		System.out.println("Short ������ �ִ� : " + Short.MAX_VALUE);
		System.out.println();
		System.out.println("Integer ���������� ---------");
		System.out.println("�޸� ũ�� : " + Integer.BYTES + " ����Ʈ");	
		System.out.println("Integer ������ �ּڰ� : " + Integer.MIN_VALUE);
		System.out.println("Integer ������ �ִ� : " + Integer.MAX_VALUE);
		System.out.println();
		System.out.println("Long ���������� ---------");
		System.out.println("�޸� ũ�� : " + Long.BYTES + " ����Ʈ");	
		System.out.println("Long ������ �ּڰ� : " + Long.MIN_VALUE);
		System.out.println("Long ������ �ִ� : " + Long.MAX_VALUE);

	}
}
/*	
 * 	���������� �⺻ ������  byte, short, int, long 4���� �̸� 
 * 				�� ���� �޸𸮿� �Ҵ�޴� ũ��(����Ʈ ����)�� �׿� ���� ���� ǥ�� ������ �����˴ϴ�.
 *  			�� ������ ������ �� �ʿ��� Ű����(�����, �뵵�� �̹� ������ �ܾ�)
 *  
 *	Byte, Short, Integer, Long Ŭ������ ���������� ���ĸ� �ٷ�� �Ӽ��� �޼ҵ带 ���� Ŭ�����Դϴ�.(Wrapper ���� Ŭ����)
 *		�� ������ �� Ŭ�������� ��������� �Ӽ�(�ʵ�)�� �� ������ �ʴ� ��(���) �Դϴ�. ��ü�� �빮�ڷ� ǥ���մϴ�.
 *			�� BYTES, MIN_VALUE, MAX_VALUE
 * 			
 *	"123, 200(���ͷ�)�� int �����Դϴ�. ==> 4byte�� �����."			
 */