package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
// �ۼ��� : �̰���
	public static void main(String[] args) {
		/*  
		 * ���� �̸��� ������ üũ�ϴ� ��� ���� 
		 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
		 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastIndexof �� ���� ���ΰ�?
		 *  
		 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
		 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ������ substring ������ ���ڿ��� equals ��
		 *  
		 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
		 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
		 *  
		 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
		 *  		�� 3���� ���ڿ��� length() �� 6���� ��
		 *  
		 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
		 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
		 */

		
		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;			// �̰� ��� ó���ϴ°����� �𸣰ڳ�..
		
		System.out.print("����� �̸����� �Է��ϼ���. >>> ");
		email = sc.nextLine();			// Ű���� �Է��� ���ڿ��� ó���Ѵ�.
		
		int sub = email.indexOf('@');
		
		// �Է¹��� email�� ó������ 1, 2, 4, 5�� �ش����� ������ �޽��� ����ϰ� isValid ������ false�� �Ѵ�.	-> isValid ���
		
		if ((sub != email.lastIndexOf('@')) || sub == -1) {	// ���� 1
			System.out.println("�̸��� ������ �ƴմϴ�.");
		} else if (!(email.substring(sub).equals("@gmail.com"))) {	// ���� 2
			System.out.println("������ �̸��� Ʋ���ϴ�.");
		} else {
			String id = email.substring(0, sub);
			System.out.println(id);			// ���� 3
			if (!(id.length() >= 6)) {		// ���� 4
				System.out.println("���� �̸��� 6���� �̻��̾�� �մϴ�.");
			} else if (id.indexOf('$') == -1 && id.indexOf('%') == -1) {		// ���� 5
				System.out.println("�ùٸ� �����Դϴ�.");
			} else {
				System.out.println("�����̸����� Ư����ȣ $, %�� ���ԵǸ� �ȵ˴ϴ�.");
			}

		}
		sc.close();
	}

}
