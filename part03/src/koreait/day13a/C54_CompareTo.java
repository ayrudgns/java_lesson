package koreait.day13a;

public class C54_CompareTo {
	public static void main(String[] args) {
// ��� ��ü(Object�� ��ӹ��� ��ü)���� compareTo��� �޼ҵ尡 �ִ�. ==> ���� ��
		
		String na = "kim";
		String you = "momo";
		String he = "Son";
		
		// String�� ���ĺ�(������) ��
		System.out.println("kim�� momo �� : " + na.compareTo(you));		// -2 (����) : "kim" < "momo" 
																		// => "kim" - "momo" < 0
		System.out.println("kim�� Son �� : " + na.compareTo(he));		// 24 (���) : "kim" > "Son"	 
																		// => "kim" - "Son" > 0 
		// ���ĺ� �빮�ڰ� ���ĺ� �ҹ��ں��� ���� �۴�. (ASKII �ڵ�)
		System.out.println();
		
		int a = 12;
		int b = 45;
		System.out.println("a - b = " + (a - b));		// 12 - 45 < 0 ==> ���� �׳� ���
		
		Integer aa = 12;
		Integer bb = 45;
		System.out.println("12��  45 : " + aa.compareTo(bb));		// -1 : aa < bb	==> ��Ұ��踸 ���
		aa = 90;
		System.out.println("90�� 45 : " + aa.compareTo(bb));		// 1 : aa > bb
		aa = 45;
		System.out.println("45�� 45 : " + aa.compareTo(bb));		// 0 : aa == bb
		
		// compareTo()�� ���� �񱳴� sort(����)�� ���ȴ�.
		// ������ �������� ���İ� �������� ������ �ִ�.
	}

}
