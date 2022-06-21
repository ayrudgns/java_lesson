package koreait.day09;

public class C44_ForEachTest {
	public static void main(String[] args) {
		
		int[] itest = {1, 2, 3, 4, 5, 6};
		String[] stest = {"break", "public", "each", "package", "while"};
		
		// �迭�� for������ ������ ��, �ε��� ������ ����Ѵ�.
		for (int i = 0; i < itest.length; i++) {	// �̶� itest[i]�� int Ÿ���̴�.
			System.out.println("i = " + i + ", itest[i] = " + itest[i]);
		}
		System.out.println();
		
		// temp ���� ���
		for (int i = 0; i < itest.length; i++) {
			int temp = itest[i];
			System.out.println("i = " + i + ", itest[i] = " + temp);
		}
		System.out.println();
		
		for (int i = 0; i < stest.length; i++) {	// �̶� stest[i]�� String Ÿ���̴�.
			System.out.println("i = " + i + ", stest[i] = " + stest[i]);
		}
		System.out.println();
		
		// temp ���� ���
		for (int i = 0; i < stest.length; i++) {	// �̶� stest[i]�� String Ÿ���̴�.
			String temp = stest[i];
			System.out.println("i = " + i + ", stest[i] = " + temp);
		}
		System.out.println();
		
		// �ڵ��� �� ȿ������ ���̱� ���� '���� for��'�� ����Ѵ�. (for each��)
		// ��, itest[i]�� stest[i]�� ����ϰ� �ε��� ���� i�� ������� ���� ��
		// �迭�� ���� ������ ������ ���� for���� ���ϴ�.
		System.out.println("itest �迭��");
		for(int temp : itest) {				// �迭�� ����� ���� ������� ������ temp ������ ����
			System.out.println(temp);		// Line 15 ~ 19�� �����ϰ� �� �ڵ��̴�.
		}
		System.out.println();
		
		System.out.println("stest �迭��");
		for(String temp : stest) {
			System.out.println(temp);
		}
		
	}
}
