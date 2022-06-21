package koreait.day04;

import java.util.Scanner;

public class C21_StringEx2 {
// �ۼ��� : �̰��� ==>> ����� �ް� �����غ���.
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
		boolean isValid = true;
		
		System.out.print("����� �̸����� �Է��ϼ���. >>> ");
		email = sc.nextLine();			// Ű���� �Է��� ���ڿ��� ó���Ѵ�.
		
		int sub = email.indexOf('@');
		String domain = email.substring(sub + 1, email.length());
		// �Է¹��� email�� ó������ 1, 2, 4, 5�� �ش����� ������ �޽��� ����ϰ� isValid ������ false�� �Ѵ�.	-> isValid ���
		
		if (sub == email.lastIndexOf('@') && sub != -1)  {
			String id = email.substring(0, sub);
			System.out.println(id);
			if (domain.equals("gmail.com")) {
				if(id.length() >= 6) {
					if (!(id.indexOf('$') == -1 && id.indexOf('%') == -1)) {
						System.out.println("$, %�� ����� �� ���� ��ȣ�Դϴ�.");
						isValid = false;
					}
				} else {
					System.out.println("���� �̸��� 6���� �̻��̾�� �մϴ�.");
					isValid = false;
				}
			} else {
				System.out.println("������ ������ Ʋ���ϴ�.");
				isValid = false;
			}
		} else {
			System.out.println("�ùٸ� �̸��� ������ �ƴմϴ�.");
			isValid = false;
		}
		
		System.out.println("�̸��� ���� ��� : " + isValid);
		sc.close();
	}

}
