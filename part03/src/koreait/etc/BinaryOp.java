package koreait.etc;

public class BinaryOp {
	public static void main(String[] args) {
	//  2������ ��Ʈ ���� : &, |, ^, ~, >>, << ���... ������ test
	
		int data = 0b0101110100100110;
		
		System.out.println("1. ~(��Ʈ ����) ���� ���");		// ���� : ! ������ true�� false�� �ݴ��,
														// ~ ������ ��Ʈ ����, ��Ʈ ����
		System.out.println(String.format("%32s", Integer.toBinaryString(data)));
		System.out.println(String.format("%32s", Integer.toBinaryString(~data)));
		System.out.println();
		
		System.out.println("2. ������ shift(>>) ����");	// ������ �������� shift ���� Ƚ��
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data >> 1), data >> 1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data >> 2), data >> 2));
		// >> 1�� data�� / 2�� ��� + 2������ ���������� �� ĭ �и�, >> 2�� / 2�� �ѹ� �� �� ��� + 2������ ���������� �� ĭ �� �и�
		// �� �տ� 0�� �߰��Ǵ� �� (����� ���)
		System.out.println();
		
		System.out.println("3. ���� shift(<<) ����");	// ������ �������� shift ���� Ƚ��
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data << 1), data << 1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data << 2), data << 2));
		// << 1�� data�� * 2�� ��� + 2������ �������� �� ĭ �и�, << 2�� * 2�� �ѹ� �� �� ��� + 2������ �������� �� ĭ �и�
		// �� �ڿ� 0�� �߰��Ǵ� �� (����� ���)
		System.out.println();
		
		data = -2345;
		System.out.println("4. ������ ������ shift(>>) ����");	// ���ʿ� �߰��Ǵ� ��Ʈ��? 1, �������̴ϱ�
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data >> 1), data >> 1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data >> 2), data >> 2));
		// ���� 32��Ʈ�� �� ���� ��Ʈ�� ��ȣ�� ǥ���Ѵ�. ������ shift ���꿡�� ���ʿ� �߰��Ǵ� ��Ʈ�� ��ȣ ��Ʈ�� ����.
		// ���� : ������ shift�� �� ��ȣ�� ��� ���� ���ʿ� �߰��Ǵ� ��Ʈ�� 0���� �ؾ��� ���� >>> �������� �Ѵ�. (5��)
		System.out.println();
		
		System.out.println("5. ������ shift(>>>) ����2");	// ������ �������� shift ���� Ƚ��
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data >>> 2), data >>> 2));
		// Line 37 ����. 10�������� �ǹ̾���.
		System.out.println();
		
		int n = 0xffffffff;		// 32��Ʈ�� ��� 1
		data = 100;
		// ���� : �� ���� and(&&)�� [��] and [��]�� ���� ����� ��
		//		 �� ���� or(||)�� [����] or [����]�� ���� ����� ����
		// ��Ʈ ���� and(&)�� 1 & 1�� ���� ����� 1, ��Ʈ ���� or(|)��  0 or 0�� ���� ����� 0
		// ��Ʈ ���� Ȱ�� : x & 1�� ����� x, x & 0�� ����� 0, x | 1�� ����� 1, x | 0�� ����� x
		System.out.println("6. bit and(&) ����");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("=======================================");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data & n), data & n));
		System.out.println();	// ����� 100 (data)
		
		System.out.println("7. bit or(|) ����");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("=======================================");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data | n), data | n));
		System.out.println();	// ����� -1 (2���� ��Ʈ ��� 1)
		
		n = 0;
		System.out.println("8. bit and(&) ����");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("=======================================");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data & n), data & n));
		System.out.println();	// ����� 0
		
		System.out.println("9. bit or(|) ����");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("=======================================");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data | n), data | n));
		System.out.println();	// ����� 100 (data)
		
	}
}
