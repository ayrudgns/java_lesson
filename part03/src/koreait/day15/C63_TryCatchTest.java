package koreait.day15;

import java.util.InputMismatchException;

public class C63_TryCatchTest {
	public static void main(String[] args) {
		// try ����
		try {
			// Exception ���ɼ��� �ִ� ����� �ۼ� ==> ������ ����� catch������ ����.
			// �ش� ��ġ���� ������ �����ϸ� try { }�� ���������� �ȴ�.
			
		} catch (NullPointerException e) {		// ���� ���ο� ���� Exception ������ �˻��Ѵ�.
			// NullPointerException�� ���� �Ʒ� ����� ó���Ѵ�.
			e.printStackTrace();		// ������ �߻���Ű�� ������ ���. (������ �����ϱ� ����.)
										// ��, ���� Exception ��� �����̴�.
			
		} catch (InputMismatchException e) {	// catch���� ������ �� �� �ִ�.
			// InputMismatchException�� ���� �Ʒ� ����� ó���Ѵ�.
			
		} finally {		// ����������, ���������� : ���� �߻��� ������� ����Ǵ� �κ�
			// �ַ� �ڿ��� �����ϴ� �ڵ带 �ۼ��Ѵ�. 
			// ex) ��ĳ�ʸ� �����Դٸ� finally���� ����(sc.close();)
		}
		
		// try ���� ��� �Ǵ� catch ���� ����� ������ ������ ��ӵȴ�.
	}

}
