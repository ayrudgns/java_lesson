package koreait.etc;

public class BinaryTest {
	public static void main(String[] args) {
		
		System.out.println(String.format("%s\t %8s\t %8s", "10����", "2����", "16����"));
		for(int i = 0; i < 100; i++) {
			System.out.println(String.format("%8d\t %8s\t %8s", i, 
					Integer.toBinaryString(i), Integer.toHexString(i)));
		}
	}
	
	/*
	 *  10���� �������� �ٸ� ����(����)���� ���ڿ� ��ȯ
	 *  Integer.toBinaryString(i) => 2������ ��ȯ
	 *  Integer.toOctalString(i) => 8������ ��ȯ
	 *  Integer.toHexString(i) => 16������ ��ȯ
	 *  
	 *  int ������ 4byte, 32bit
	 *  2������ 32�ڸ�, 16�����δ� 8�ڸ�
	 *  xxxx xxxx xxxx xxxx xxxx xxxx xxxx xxxx
	 *  10�����δ� �� ������ -2147483648 ~ 2147483648
	 *  16�����δ� 00000000 ~ ffffffff (32bit�� ��� 1, -1)
	 *  
	 *  0xxx xxxx xxxx xxxx xxxx xxxx xxxx xxxx = ���
	 *  1xxx xxxx xxxx xxxx xxxx xxxx xxxx xxxx = ����
	 *  
	 *  1000 0000 0000 0000 0000 0000 0000 0000 = -2147483648
	 *  1111 1111 1111 1111 1111 1111 1111 1111 = -1
	 */
}
