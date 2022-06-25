package koreait.day18;

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
	 */
}
